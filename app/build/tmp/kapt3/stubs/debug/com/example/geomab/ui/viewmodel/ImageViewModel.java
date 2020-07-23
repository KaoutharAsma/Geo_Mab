package com.example.geomab.ui.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001 B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u001c\u001a\u00020\u001dH\u0014J\u0006\u0010\u001e\u001a\u00020\u001dJ\b\u0010\u001f\u001a\u00020\u001dH\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0010R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/example/geomab/ui/viewmodel/ImageViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "id", "", "(Landroid/app/Application;I)V", "_eventNetworkError", "Landroidx/lifecycle/MutableLiveData;", "", "_isNetworkErrorShown", "db", "Lcom/example/geomab/data/database/AppDatabase;", "eventNetworkError", "Landroidx/lifecycle/LiveData;", "getEventNetworkError", "()Landroidx/lifecycle/LiveData;", "geoMobRepository", "Lcom/example/geomab/data/repository/GeoMobRepository;", "images", "", "Lcom/example/geomab/data/database/SlideShowImagesItem;", "getImages", "isNetworkErrorShown", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "viewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "onCleared", "", "onNetworkErrorShown", "refreshDataFromRepository", "Factory", "app_debug"})
public final class ImageViewModel extends androidx.lifecycle.AndroidViewModel {
    private final int id = 0;
    private final com.example.geomab.data.database.AppDatabase db = null;
    private final com.example.geomab.data.repository.GeoMobRepository geoMobRepository = null;
    private final kotlinx.coroutines.CompletableJob viewModelJob = null;
    private final kotlinx.coroutines.CoroutineScope viewModelScope = null;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _eventNetworkError;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isNetworkErrorShown;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.geomab.data.database.SlideShowImagesItem>> images = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.geomab.data.database.SlideShowImagesItem>> getImages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isNetworkErrorShown() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getEventNetworkError() {
        return null;
    }
    
    private final void refreshDataFromRepository() {
    }
    
    public final void onNetworkErrorShown() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public ImageViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, int id) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\'\u0010\t\u001a\u0002H\n\"\n\b\u0000\u0010\n*\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH\u0016\u00a2\u0006\u0002\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/geomab/ui/viewmodel/ImageViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "app", "Landroid/app/Application;", "id", "", "(Landroid/app/Application;I)V", "getApp", "()Landroid/app/Application;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final int id = 0;
        @org.jetbrains.annotations.NotNull()
        private final android.app.Application app = null;
        
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.app.Application getApp() {
            return null;
        }
        
        public Factory(@org.jetbrains.annotations.NotNull()
        android.app.Application app, int id) {
            super();
        }
    }
}