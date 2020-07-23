package com.example.geomab.data.network.response.youtube


import com.google.gson.annotations.SerializedName

data class Item(
    val etag: String,
    val id: Id,
    val kind: String
)