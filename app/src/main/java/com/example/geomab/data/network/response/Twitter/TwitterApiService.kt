package com.example.geomab.data.network.response.Twitter

import com.example.geomab.data.network.ConectivityInterceptor
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import kotlinx.coroutines.Deferred
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface TwitterApiService {
    @Headers(
        "authorization: Bearer AAAAAAAAAAAAAAAAAAAAAD5GFgEAAAAATn1YpQ2lgSXdW6ZkEas%2FqTWFK8o%3DfaCeyKgdIZDbOzjD9LXx59KPnW8sGCrc4Z3aa7bmefT6x4NbAt"
    ,"Content-Type: application/json"
    )
    @POST("development.json")
    fun getTweets(
        @Body body: RequestTwitter
    ): Deferred<TwitterResponse>

    companion object{
        operator fun invoke(conectivityInterceptor: ConectivityInterceptor): TwitterApiService {

            val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(conectivityInterceptor)
                .build()
            return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("https://api.twitter.com/1.1/tweets/search/30day/")
                .addCallAdapterFactory(CoroutineCallAdapterFactory())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(TwitterApiService::class.java)
        }
    }
}

class RequestTwitter(query: String) {
    var query = query
    var maxResults = 10
}
