package com.example.geomab.data.network.response.youtube

import com.example.geomab.data.network.ConectivityInterceptor
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import kotlinx.coroutines.Deferred
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface YoutubeApiService {

    @GET("search")
    fun getYoutube(
        @Query("order") order:String="date",
        @Query("q") q:String,
        @Query("key") key:String="AIzaSyDgmkWC_ENIQpa9hMQFQEKfP_exH1apris"
    ): Deferred<YoutubeResponse>

    companion object{
        operator fun invoke(conectivityInterceptor: ConectivityInterceptor): YoutubeApiService {

            val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(conectivityInterceptor)
                .build()
            return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("https://www.googleapis.com/youtube/v3/")
                .addCallAdapterFactory(CoroutineCallAdapterFactory())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(YoutubeApiService::class.java)
        }
    }
}