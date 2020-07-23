package com.example.geomab.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001b\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/example/geomab/data/network/APINetworkDataSourceImpl;", "Lcom/example/geomab/data/network/APINetworkDataSource;", "apiCountryService", "Lcom/example/geomab/data/network/response/ApiCountryService;", "(Lcom/example/geomab/data/network/response/ApiCountryService;)V", "_downloadCountries", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/geomab/data/network/response/CountryResponse;", "_downloadImages", "Lcom/example/geomab/data/network/response/SlideShowImages;", "downloadCountries", "Landroidx/lifecycle/LiveData;", "getDownloadCountries", "()Landroidx/lifecycle/LiveData;", "downloadImages", "getDownloadImages", "fetchCountries", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchSlideShows", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class APINetworkDataSourceImpl implements com.example.geomab.data.network.APINetworkDataSource {
    private final androidx.lifecycle.MutableLiveData<com.example.geomab.data.network.response.CountryResponse> _downloadCountries = null;
    private final androidx.lifecycle.MutableLiveData<com.example.geomab.data.network.response.SlideShowImages> _downloadImages = null;
    private final com.example.geomab.data.network.response.ApiCountryService apiCountryService = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.example.geomab.data.network.response.CountryResponse> getDownloadCountries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.example.geomab.data.network.response.SlideShowImages> getDownloadImages() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchCountries(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.geomab.data.network.response.CountryResponse> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchSlideShows(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.geomab.data.network.response.SlideShowImages> p1) {
        return null;
    }
    
    public APINetworkDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.example.geomab.data.network.response.ApiCountryService apiCountryService) {
        super();
    }
}