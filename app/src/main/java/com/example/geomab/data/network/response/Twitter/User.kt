package com.example.geomab.data.network.response.Twitter


import com.google.gson.annotations.SerializedName

data class User(
    val name: String,
    @SerializedName("profile_image_url")
    val profileImageUrl: String,
    @SerializedName("profile_image_url_https")
    val profileImageUrlHttps: String,
    @SerializedName("screen_name")
    val screenName: String
)