package com.example.geomab.data.network.response.Twitter


import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("created_at")
    val createdAt: String,
    val text:String,
    @SerializedName("extended_tweet")
    val extendedTweet: ExtendedTweet,
    val user: User
)