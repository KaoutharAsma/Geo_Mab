package com.example.geomab.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Country(
    @PrimaryKey val pk: Int,
    val description: String,
    val capital:String,
    val drapeau: String,
    val drapeau_carre:String,
    val historique: String,
    val hymne: String,
    val name: String,
    val personnalités: String,
    val population: String,
    val ressources: String,
    val surface: String,
    var seen:Boolean = false
)