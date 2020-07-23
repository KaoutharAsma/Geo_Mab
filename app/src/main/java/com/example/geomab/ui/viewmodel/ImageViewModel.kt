package com.example.geomab.ui.viewmodel

import android.app.Application
import androidx.lifecycle.*
import com.example.geomab.data.database.AppDatabase
import com.example.geomab.data.repository.GeoMobRepository
import com.example.geomab.internal.NoConnectivityException
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

class ImageViewModel(application: Application,id:Int) : AndroidViewModel(application) {
    private val id = id
    private val db = AppDatabase.invoke(application)
    private val geoMobRepository = GeoMobRepository(db,application,id)
    private val viewModelJob = SupervisorJob()
    private val viewModelScope = CoroutineScope(viewModelJob + Dispatchers.Main)
    private var _eventNetworkError = MutableLiveData<Boolean>()
    private var _isNetworkErrorShown = MutableLiveData<Boolean>()
    val images = geoMobRepository.images
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
                geoMobRepository.refreshImages(id)
                _eventNetworkError.value = false
                _isNetworkErrorShown.value = false

            } catch (networkError: NoConnectivityException) {
                // Show a Toast error message and hide the progress bar.
                if(images.value.isNullOrEmpty())
                    _eventNetworkError.value = true
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

    class Factory(val app: Application,id: Int) : ViewModelProvider.Factory {
        private val id = id
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(ImageViewModel::class.java)) {
                @Suppress("UNCHECKED_CAST")
                return ImageViewModel(app,id) as T
            }
            throw IllegalArgumentException("Unable to construct viewmodel")
        }
    }
}