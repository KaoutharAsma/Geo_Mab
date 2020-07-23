package com.example.geomab.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0013\u0010\n\u001a\u0004\u0018\u00010\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/geomab/data/network/APINetworkDataSource;", "", "downloadCountries", "Landroidx/lifecycle/LiveData;", "Lcom/example/geomab/data/network/response/CountryResponse;", "getDownloadCountries", "()Landroidx/lifecycle/LiveData;", "downloadImages", "Lcom/example/geomab/data/network/response/SlideShowImages;", "getDownloadImages", "fetchCountries", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchSlideShows", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface APINetworkDataSource {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.example.geomab.data.network.response.CountryResponse> getDownloadCountries();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.example.geomab.data.network.response.SlideShowImages> getDownloadImages();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchCountries(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.geomab.data.network.response.CountryResponse> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchSlideShows(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.geomab.data.network.response.SlideShowImages> p1);
}