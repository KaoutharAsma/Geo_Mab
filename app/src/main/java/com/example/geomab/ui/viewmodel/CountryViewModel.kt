package com.example.geomab.ui.viewmodel

import android.app.Application
import android.content.Context
import androidx.lifecycle.*
import com.example.geomab.data.database.AppDatabase
import com.example.geomab.data.repository.GeoMobRepository
import com.example.geomab.internal.NoConnectivityException
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import java.io.IOException

class CountryViewModel(application: Application) : AndroidViewModel(application) {
    private val db = AppDatabase.invoke(application)
    private val geoMobRepository = GeoMobRepository(db,application)
    private val viewModelJob = SupervisorJob()
    private val viewModelScope = CoroutineScope(viewModelJob + Dispatchers.Main)
    private var _eventNetworkError = MutableLiveData<Boolean>()
    private var _isNetworkErrorShown = MutableLiveData<Boolean>()
    val countries = geoMobRepository.list
    val isNetworkErrorShown: LiveData<Boolean>
        get() = _isNetworkErrorShown

    init {
        refreshDataFromRepository()
    }

    val eventNetworkError: LiveData<Boolean>
        get() = _eventNetworkError
    private fun refreshDataFromRepository() {
        viewModelScope.launch {
            try {
                geoMobRepository.refreshCountries()

            } catch (e:NoConnectivityException) {
            }
        }
    }

    fun onNetworkErrorShown() {
        _isNetworkErrorShown.value = true
    }


    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }

    class Factory(val app: Application) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(CountryViewModel::class.java)) {
                @Suppress("UNCHECKED_CAST")
                return CountryViewModel(app) as T
            }
            throw IllegalArgumentException("Unable to construct viewmodel")
        }
    }
}