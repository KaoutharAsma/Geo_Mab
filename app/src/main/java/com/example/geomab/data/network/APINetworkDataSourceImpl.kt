package com.example.geomab.data.network

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.geomab.data.database.SlideShowImagesItem
import com.example.geomab.data.network.response.ApiCountryService
import com.example.geomab.data.network.response.CountryResponse
import com.example.geomab.data.network.response.SlideShowImages
import com.example.geomab.internal.NoConnectivityException

class APINetworkDataSourceImpl(
    private val apiCountryService: ApiCountryService
) : APINetworkDataSource {

    private val _downloadCountries = MutableLiveData<CountryResponse>()
    override val downloadCountries:LiveData<CountryResponse>
        get() = _downloadCountries

    private val _downloadImages = MutableLiveData<SlideShowImages>()
    override val downloadImages:LiveData<SlideShowImages>
        get() = _downloadImages

    override suspend fun fetchCountries(): CountryResponse? {
        try {
            val fetchedCountries = apiCountryService.getContries().await()
            _downloadCountries.postValue(fetchedCountries)
            return fetchedCountries
        } catch (e: NoConnectivityException) {
            Log.e(" Connectivity : ", " No Internet Connection. ", e)
        }
        return null
    }

    override suspend fun fetchSlideShows(id: Int): SlideShowImages? {
        try {
            val fetchedImages = apiCountryService.getSlideShowImages(id).await()
            _downloadImages.postValue(fetchedImages)
            return fetchedImages
        } catch (e: NoConnectivityException) {
            Log.e(" Connectivity : ", " No Internet Connection. ", e)
        }
        return null
    }
}