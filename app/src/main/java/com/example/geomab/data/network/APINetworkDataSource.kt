package com.example.geomab.data.network
import androidx.lifecycle.LiveData
import com.example.geomab.data.network.response.CountryResponse
import com.example.geomab.data.network.response.SlideShowImages

interface APINetworkDataSource {
    val downloadCountries: LiveData<CountryResponse>
    val downloadImages: LiveData<SlideShowImages>
    suspend fun fetchCountries(): CountryResponse?
    suspend fun fetchSlideShows(id:Int): SlideShowImages?
}
