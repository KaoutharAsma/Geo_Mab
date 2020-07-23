package com.example.geomab.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.geomab.R
import com.example.geomab.data.database.AppDatabase
import com.example.geomab.data.database.Country
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        plus.setOnClickListener {
            startActivity(Intent(this, ListOfCountries::class.java))
        }


    }

    override fun onResume() {
        super.onResume()
        doAsync {
            val db = AppDatabase(this@MainActivity)
            var country: Country?
            country = db.countryDao().getNotSeen()
            if ( country == null ){
                db.countryDao().SetAllSeen()
                country = db.countryDao().getNotSeen()
            }
            if (country != null) {
                Log.e("country",country.seen.toString())
            }

            uiThread {
                Toast.makeText(this@MainActivity, "hhhh", Toast.LENGTH_LONG)
                Picasso.get()
                    .load(country?.drapeau)
                    .into(flag)
                country_name.text = country?.name
            }
                flag.setOnClickListener {
                    val intent = Intent(MainActivity(), CountryDetails::class.java)
                    if (country != null) {
                        intent.putExtra("country_id",country.pk)
                        intent.putExtra("name",country.name)
                        intent.putExtra("flag",country.drapeau_carre)
                        intent.putExtra("description",country.description)
                        intent.putExtra("history",country.historique)
                        intent.putExtra("capital",country.capital)
                        intent.putExtra("hymne",country.hymne)
                        intent.putExtra("personnalités",country.personnalités)
                        intent.putExtra("population",country.population)
                        intent.putExtra("ressources",country.ressources)
                        intent.putExtra("surface",country.surface)
                        startActivity(intent)
                    }

            }


        }
    }

}


