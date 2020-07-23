package com.example.geomab.data.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J \u0010\u0007\u001a\u00020\u00032\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bH\'J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\rH\'J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\n\u0010\u0010\u001a\u0004\u0018\u00010\nH\'\u00a8\u0006\u0011"}, d2 = {"Lcom/example/geomab/data/database/CountryDao;", "", "SetAllSeen", "", "SetSeen", "id", "", "addCountries", "countries", "Ljava/util/ArrayList;", "Lcom/example/geomab/data/database/Country;", "Lkotlin/collections/ArrayList;", "getCountries", "Landroidx/lifecycle/LiveData;", "", "getCountry", "getNotSeen", "app_debug"})
public abstract interface CountryDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select * from Country")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.geomab.data.database.Country>> getCountries();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select * from Country where pk = :id")
    public abstract com.example.geomab.data.database.Country getCountry(int id);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void addCountries(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.geomab.data.database.Country> countries);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "Select * from Country where seen = 0 LIMIT 1")
    public abstract com.example.geomab.data.database.Country getNotSeen();
    
    @androidx.room.Query(value = "Update Country SET seen =0")
    public abstract void SetAllSeen();
    
    @androidx.room.Query(value = "Update Country SET seen =1 where pk = :id")
    public abstract void SetSeen(int id);
}