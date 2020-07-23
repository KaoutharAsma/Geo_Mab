package com.example.geomab.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0014J\u0016\u0010\u0010\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/geomab/ui/ListOfCountries;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/geomab/ui/adapter/CountryRecycleAdapter$OnClickListner;", "()V", "viewModel", "Lcom/example/geomab/ui/viewmodel/CountryViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "item", "Lcom/example/geomab/data/database/Country;", "p", "", "onResume", "refresh", "countryItems", "", "app_debug"})
public final class ListOfCountries extends androidx.appcompat.app.AppCompatActivity implements com.example.geomab.ui.adapter.CountryRecycleAdapter.OnClickListner {
    private com.example.geomab.ui.viewmodel.CountryViewModel viewModel;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void refresh(java.util.List<com.example.geomab.data.database.Country> countryItems) {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.example.geomab.data.database.Country item, int p) {
    }
    
    public ListOfCountries() {
        super();
    }
}