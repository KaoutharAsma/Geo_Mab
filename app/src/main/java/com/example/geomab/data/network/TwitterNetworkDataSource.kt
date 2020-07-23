package com.example.geomab.data.network

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.geomab.data.database.SlideShowImagesItem
import com.example.geomab.data.network.response.ApiCountryService
import com.example.geomab.data.network.response.CountryResponse
import com.example.geomab.data.network.response.SlideShowImages
import com.example.geomab.data.network.response.Twitter.RequestTwitter
import com.example.geomab.data.network.response.Twitter.TwitterApiService
import com.example.geomab.data.network.response.Twitter.TwitterResponse
import com.example.geomab.internal.NoConnectivityException

class TwitterNetworkDataSource(
    private val apiCountryService: TwitterApiService
) {

     suspend fun fetchTweets(body:RequestTwitter): TwitterResponse? {
        try {
            return apiCountryService.getTweets(body).await()
        } catch (e: NoConnectivityException) {
            Log.e(" Connectivity : ", " No Internet Connection. ", e)
        }
        return null
    }
}