package com.example.geomab.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\u0016\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/example/geomab/data/repository/GeoMobRepository;", "", "db", "Lcom/example/geomab/data/database/AppDatabase;", "context", "Landroid/content/Context;", "id", "", "(Lcom/example/geomab/data/database/AppDatabase;Landroid/content/Context;I)V", "apiNetworkDataSource", "Lcom/example/geomab/data/network/APINetworkDataSourceImpl;", "apiService", "Lcom/example/geomab/data/network/response/ApiCountryService;", "images", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/geomab/data/database/SlideShowImagesItem;", "getImages", "()Landroidx/lifecycle/LiveData;", "list", "Lcom/example/geomab/data/database/Country;", "getList", "refreshCountries", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshImages", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GeoMobRepository {
    private final com.example.geomab.data.database.AppDatabase db = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.geomab.data.database.Country>> list = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.geomab.data.database.SlideShowImagesItem>> images = null;
    private final com.example.geomab.data.network.response.ApiCountryService apiService = null;
    private final com.example.geomab.data.network.APINetworkDataSourceImpl apiNetworkDataSource = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.geomab.data.database.Country>> getList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.geomab.data.database.SlideShowImagesItem>> getImages() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object refreshCountries(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object refreshImages(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public GeoMobRepository(@org.jetbrains.annotations.NotNull()
    com.example.geomab.data.database.AppDatabase db, @org.jetbrains.annotations.NotNull()
    android.content.Context context, int id) {
        super();
    }
}