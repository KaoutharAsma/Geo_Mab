package com.example.geomab.data.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\'J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\'J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\r0\f2\u0006\u0010\t\u001a\u00020\nH\'J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\r0\fH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/example/geomab/data/database/SlideShowImageDao;", "", "addSlideShowImages", "", "images", "Ljava/util/ArrayList;", "Lcom/example/geomab/data/database/SlideShowImagesItem;", "Lkotlin/collections/ArrayList;", "getSlideShowImage", "id", "", "getSlideShowImageByCountry", "Landroidx/lifecycle/LiveData;", "", "getSlideShowImages", "app_debug"})
public abstract interface SlideShowImageDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select * from SlideShowImagesItem")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.geomab.data.database.SlideShowImagesItem>> getSlideShowImages();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select * from SlideShowImagesItem where pk = :id")
    public abstract com.example.geomab.data.database.SlideShowImagesItem getSlideShowImage(int id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select * from SlideShowImagesItem where country = :id")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.geomab.data.database.SlideShowImagesItem>> getSlideShowImageByCountry(int id);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void addSlideShowImages(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.geomab.data.database.SlideShowImagesItem> images);
}