package com.example.geomab.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.geomab.ui.ListOfCountries
import com.example.geomab.R
import com.example.geomab.data.database.Country
import com.squareup.picasso.Picasso

class CountryRecycleAdapter(private val activity: ListOfCountries, val clickListner: OnClickListner, private val list: MutableList<Country>) :
    RecyclerView.Adapter<CountryRecycleAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(activity).inflate(R.layout.item, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, p1: Int) {
//        holder.countryName.text = list[p1].name
//        Picasso.with(activity)
//            .load(list[p1].drapeau)
//            .into(holder.countryImage)

        holder.initialize(list[p1],clickListner)
    }

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        val countryName: TextView = v.findViewById(R.id.country_name)
        val countryImage : ImageView = v.findViewById(R.id.country_image)

        fun initialize(item: Country, action:OnClickListner){
            countryName.text = item.name
            Picasso.get()
                .load(item.drapeau)
                .into(countryImage)
            itemView.setOnClickListener{
                action.onItemClick(item,adapterPosition)
            }
        }
    }

    interface OnClickListner{
        fun onItemClick(item: Country, p1:Int)
    }

}