package com.example.geomab.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.geomab.R
import kotlinx.android.synthetic.main.activity_wikipedia.*

class Wikipedia : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wikipedia)
        val bundle= intent.getStringExtra("country")
        if(bundle!=null){
            web_page.loadUrl("https://fr.m.wikipedia.org/wiki/$bundle")
        }
    }
}
