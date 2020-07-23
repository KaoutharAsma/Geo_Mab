package com.example.geomab.data.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface CountryDao {
    @Query("Select * from Country")
    fun getCountries(): LiveData<List<Country>>

    @Query("Select * from Country where pk = :id")
    fun getCountry(id:Int):Country

    @Insert(onConflict =OnConflictStrategy.IGNORE)
    fun addCountries(countries: ArrayList<Country>)

    @Query("Select * from Country where seen = 0 LIMIT 1")
    fun getNotSeen():Country?

    @Query("Update Country SET seen =0")
    fun SetAllSeen()

    @Query("Update Country SET seen =1 where pk = :id")
    fun SetSeen(id:Int)




}