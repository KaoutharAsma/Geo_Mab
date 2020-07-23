package com.example.geomab.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface SlideShowImageDao {
    @Query("Select * from SlideShowImagesItem")
    fun getSlideShowImages(): LiveData<List<SlideShowImagesItem>>

    @Query("Select * from SlideShowImagesItem where pk = :id")
    fun getSlideShowImage(id:Int):SlideShowImagesItem

    @Query("Select * from SlideShowImagesItem where country = :id")
    fun getSlideShowImageByCountry(id:Int):LiveData<List<SlideShowImagesItem>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addSlideShowImages(images: ArrayList<SlideShowImagesItem>)

}