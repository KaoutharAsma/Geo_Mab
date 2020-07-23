package com.example.geomab.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/geomab/ui/adapter/CountryRecycleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/geomab/ui/adapter/CountryRecycleAdapter$ViewHolder;", "activity", "Lcom/example/geomab/ui/ListOfCountries;", "clickListner", "Lcom/example/geomab/ui/adapter/CountryRecycleAdapter$OnClickListner;", "list", "", "Lcom/example/geomab/data/database/Country;", "(Lcom/example/geomab/ui/ListOfCountries;Lcom/example/geomab/ui/adapter/CountryRecycleAdapter$OnClickListner;Ljava/util/List;)V", "getClickListner", "()Lcom/example/geomab/ui/adapter/CountryRecycleAdapter$OnClickListner;", "getItemCount", "", "onBindViewHolder", "", "holder", "p1", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnClickListner", "ViewHolder", "app_debug"})
public final class CountryRecycleAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.geomab.ui.adapter.CountryRecycleAdapter.ViewHolder> {
    private final com.example.geomab.ui.ListOfCountries activity = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.geomab.ui.adapter.CountryRecycleAdapter.OnClickListner clickListner = null;
    private final java.util.List<com.example.geomab.data.database.Country> list = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.geomab.ui.adapter.CountryRecycleAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.geomab.ui.adapter.CountryRecycleAdapter.ViewHolder holder, int p1) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.geomab.ui.adapter.CountryRecycleAdapter.OnClickListner getClickListner() {
        return null;
    }
    
    public CountryRecycleAdapter(@org.jetbrains.annotations.NotNull()
    com.example.geomab.ui.ListOfCountries activity, @org.jetbrains.annotations.NotNull()
    com.example.geomab.ui.adapter.CountryRecycleAdapter.OnClickListner clickListner, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.geomab.data.database.Country> list) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0013"}, d2 = {"Lcom/example/geomab/ui/adapter/CountryRecycleAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "countryImage", "Landroid/widget/ImageView;", "getCountryImage", "()Landroid/widget/ImageView;", "countryName", "Landroid/widget/TextView;", "getCountryName", "()Landroid/widget/TextView;", "initialize", "", "item", "Lcom/example/geomab/data/database/Country;", "action", "Lcom/example/geomab/ui/adapter/CountryRecycleAdapter$OnClickListner;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView countryName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView countryImage = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getCountryName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getCountryImage() {
            return null;
        }
        
        public final void initialize(@org.jetbrains.annotations.NotNull()
        com.example.geomab.data.database.Country item, @org.jetbrains.annotations.NotNull()
        com.example.geomab.ui.adapter.CountryRecycleAdapter.OnClickListner action) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/geomab/ui/adapter/CountryRecycleAdapter$OnClickListner;", "", "onItemClick", "", "item", "Lcom/example/geomab/data/database/Country;", "p1", "", "app_debug"})
    public static abstract interface OnClickListner {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        com.example.geomab.data.database.Country item, int p1);
    }
}