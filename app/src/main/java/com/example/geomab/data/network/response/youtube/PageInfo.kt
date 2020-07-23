package com.example.geomab.data.network.response.youtube


import com.google.gson.annotations.SerializedName

data class PageInfo(
    val resultsPerPage: Int,
    val totalResults: Int
)