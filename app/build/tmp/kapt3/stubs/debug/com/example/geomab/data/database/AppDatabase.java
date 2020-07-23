package com.example.geomab.data.database;

import java.lang.System;

@androidx.room.Database(entities = {com.example.geomab.data.database.Country.class, com.example.geomab.data.database.SlideShowImagesItem.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/example/geomab/data/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "countryDao", "Lcom/example/geomab/data/database/CountryDao;", "sliderShowImagesDao", "Lcom/example/geomab/data/database/SlideShowImageDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    private static volatile com.example.geomab.data.database.AppDatabase instance;
    private static final java.lang.Object LOCK = null;
    public static final com.example.geomab.data.database.AppDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.geomab.data.database.CountryDao countryDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.geomab.data.database.SlideShowImageDao sliderShowImagesDao();
    
    public AppDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0011\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/geomab/data/database/AppDatabase$Companion;", "", "()V", "LOCK", "instance", "Lcom/example/geomab/data/database/AppDatabase;", "buildDatabase", "context", "Landroid/content/Context;", "invoke", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.geomab.data.database.AppDatabase invoke(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final com.example.geomab.data.database.AppDatabase buildDatabase(android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}