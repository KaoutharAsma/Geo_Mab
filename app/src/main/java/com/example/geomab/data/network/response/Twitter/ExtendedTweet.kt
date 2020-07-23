package com.example.geomab.data.network.response.Twitter


import com.google.gson.annotations.SerializedName

data class ExtendedTweet(
    @SerializedName("full_text")
    val fullText: String
)