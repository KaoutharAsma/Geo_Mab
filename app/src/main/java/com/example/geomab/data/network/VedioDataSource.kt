package com.example.geomab.data.network

import android.util.Log
import com.example.geomab.data.network.response.vedio.VedioApiService
import com.example.geomab.data.network.response.vedio.VedioResponse
import com.example.geomab.internal.NoConnectivityException

class VedioDataSource (
    private val apiService: VedioApiService
) {

    suspend fun fetchVedios(country_id:Int): VedioResponse? {
        try {
            return apiService.getVedios(country_id).await()
        } catch (e: NoConnectivityException) {
            Log.e(" Connectivity : ", " No Internet Connection. ", e)
        }
        return null
    }
}