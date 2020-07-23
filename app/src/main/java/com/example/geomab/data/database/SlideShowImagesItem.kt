package com.example.geomab.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class SlideShowImagesItem(
    val country: Int,
    val image: String,
    val title: String?,
    @PrimaryKey val pk: Int
)