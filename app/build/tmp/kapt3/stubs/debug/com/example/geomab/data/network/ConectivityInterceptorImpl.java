package com.example.geomab.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0017J\b\u0010\u000b\u001a\u00020\fH\u0003R\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/geomab/data/network/ConectivityInterceptorImpl;", "Lcom/example/geomab/data/network/ConectivityInterceptor;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "appContext", "kotlin.jvm.PlatformType", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "isOnline", "", "app_debug"})
public final class ConectivityInterceptorImpl implements com.example.geomab.data.network.ConectivityInterceptor {
    private final android.content.Context appContext = null;
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
    @java.lang.Override()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.M)
    private final boolean isOnline() {
        return false;
    }
    
    public ConectivityInterceptorImpl(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}