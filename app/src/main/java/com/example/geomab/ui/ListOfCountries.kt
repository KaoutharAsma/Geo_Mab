package com.example.geomab.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.geomab.R
import com.example.geomab.data.database.AppDatabase
import com.example.geomab.ui.adapter.CountryRecycleAdapter
import com.example.geomab.data.database.Country
import com.example.geomab.ui.viewmodel.CountryViewModel
import kotlinx.android.synthetic.main.activity_list_of_contries.*
import org.jetbrains.anko.doAsync


class ListOfCountries : AppCompatActivity(), CountryRecycleAdapter.OnClickListner {

    private lateinit var viewModel:CountryViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(this, CountryViewModel.Factory(this.application))
            .get(CountryViewModel::class.java)

        setContentView(R.layout.activity_list_of_contries)
    }
    override fun onResume() {
        viewModel.countries.observe(this, Observer<List<Country>> { country ->
            country?.apply {
                refresh(this.toMutableList()) }
        })




        super.onResume()
    }
    private fun refresh(countryItems:MutableList<Country>){
        rv_countries.adapter = CountryRecycleAdapter(this,this,countryItems)
    }

    override fun onItemClick(item: Country, p: Int) {
//        Toast.makeText(this,item.name,Toast.LENGTH_SHORT).show()

        val intent = Intent(this, CountryDetails::class.java)
        intent.putExtra("country_id",item.pk)
        intent.putExtra("name",item.name)
        intent.putExtra("flag",item.drapeau_carre)
        intent.putExtra("description",item.description)
        intent.putExtra("history",item.historique)
        intent.putExtra("capital",item.capital)
        intent.putExtra("hymne",item.hymne)
        intent.putExtra("personnalités",item.personnalités)
        intent.putExtra("population",item.population)
        intent.putExtra("ressources",item.ressources)
        intent.putExtra("surface",item.surface)
        startActivity(intent)

    }


}
