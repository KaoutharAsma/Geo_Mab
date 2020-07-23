package com.example.geomab.data.repository
import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import com.example.geomab.data.database.AppDatabase
import com.example.geomab.data.database.Country
import com.example.geomab.data.database.SlideShowImagesItem
import com.example.geomab.data.network.APINetworkDataSourceImpl
import com.example.geomab.data.network.ConectivityInterceptorImpl
import com.example.geomab.data.network.response.ApiCountryService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class GeoMobRepository(db: AppDatabase,context: Context,id: Int=-1) {
    private val db:AppDatabase = db
    val list = db.countryDao().getCountries()
    val images= db.sliderShowImagesDao().getSlideShowImageByCountry(id)
    private val apiService = ApiCountryService(ConectivityInterceptorImpl(context))
    private val apiNetworkDataSource = APINetworkDataSourceImpl(apiService)
    suspend fun refreshCountries(){
        withContext(Dispatchers.IO) {
            val countries = apiNetworkDataSource.fetchCountries()
            var list = ArrayList<Country>()
            countries?.forEach {
                list.add(it)
            }
            db.countryDao().addCountries(list)
        }
    }
    suspend fun refreshImages(id:Int){
        withContext(Dispatchers.IO){
            val slideImages = apiNetworkDataSource.fetchSlideShows(id)
            var list = ArrayList<SlideShowImagesItem>()
            slideImages?.forEach {
                list.add(it)
            }
            db.sliderShowImagesDao().addSlideShowImages(list)
        }
    }


}