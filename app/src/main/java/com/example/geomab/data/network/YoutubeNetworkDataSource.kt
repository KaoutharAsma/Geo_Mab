package com.example.geomab.data.network
import android.util.Log
import com.example.geomab.data.network.response.youtube.YoutubeApiService
import com.example.geomab.data.network.response.youtube.YoutubeResponse
import com.example.geomab.internal.NoConnectivityException

class YoutubeNetworkDataSource(
    private val apiYoutubeApiService: YoutubeApiService
) {

    suspend fun fetchVedio(q:String): YoutubeResponse? {
        try {
            return apiYoutubeApiService.getYoutube(q=q).await()
        } catch (e: NoConnectivityException) {
            Log.e(" Connectivity : ", " No Internet Connection. ", e)
        }
        return null
    }
}