package com.example.geomab.data.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public final class AppDatabase_Impl extends AppDatabase {
  private volatile CountryDao _countryDao;

  private volatile SlideShowImageDao _slideShowImageDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Country` (`pk` INTEGER NOT NULL, `description` TEXT NOT NULL, `capital` TEXT NOT NULL, `drapeau` TEXT NOT NULL, `drapeau_carre` TEXT NOT NULL, `historique` TEXT NOT NULL, `hymne` TEXT NOT NULL, `name` TEXT NOT NULL, `personnalités` TEXT NOT NULL, `population` TEXT NOT NULL, `ressources` TEXT NOT NULL, `surface` TEXT NOT NULL, `seen` INTEGER NOT NULL, PRIMARY KEY(`pk`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `SlideShowImagesItem` (`country` INTEGER NOT NULL, `image` TEXT NOT NULL, `title` TEXT, `pk` INTEGER NOT NULL, PRIMARY KEY(`pk`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"9a6dd119b46c1991b168ba664a1d33dd\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Country`");
        _db.execSQL("DROP TABLE IF EXISTS `SlideShowImagesItem`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCountry = new HashMap<String, TableInfo.Column>(13);
        _columnsCountry.put("pk", new TableInfo.Column("pk", "INTEGER", true, 1));
        _columnsCountry.put("description", new TableInfo.Column("description", "TEXT", true, 0));
        _columnsCountry.put("capital", new TableInfo.Column("capital", "TEXT", true, 0));
        _columnsCountry.put("drapeau", new TableInfo.Column("drapeau", "TEXT", true, 0));
        _columnsCountry.put("drapeau_carre", new TableInfo.Column("drapeau_carre", "TEXT", true, 0));
        _columnsCountry.put("historique", new TableInfo.Column("historique", "TEXT", true, 0));
        _columnsCountry.put("hymne", new TableInfo.Column("hymne", "TEXT", true, 0));
        _columnsCountry.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsCountry.put("personnalités", new TableInfo.Column("personnalités", "TEXT", true, 0));
        _columnsCountry.put("population", new TableInfo.Column("population", "TEXT", true, 0));
        _columnsCountry.put("ressources", new TableInfo.Column("ressources", "TEXT", true, 0));
        _columnsCountry.put("surface", new TableInfo.Column("surface", "TEXT", true, 0));
        _columnsCountry.put("seen", new TableInfo.Column("seen", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCountry = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCountry = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCountry = new TableInfo("Country", _columnsCountry, _foreignKeysCountry, _indicesCountry);
        final TableInfo _existingCountry = TableInfo.read(_db, "Country");
        if (! _infoCountry.equals(_existingCountry)) {
          throw new IllegalStateException("Migration didn't properly handle Country(com.example.geomab.data.database.Country).\n"
                  + " Expected:\n" + _infoCountry + "\n"
                  + " Found:\n" + _existingCountry);
        }
        final HashMap<String, TableInfo.Column> _columnsSlideShowImagesItem = new HashMap<String, TableInfo.Column>(4);
        _columnsSlideShowImagesItem.put("country", new TableInfo.Column("country", "INTEGER", true, 0));
        _columnsSlideShowImagesItem.put("image", new TableInfo.Column("image", "TEXT", true, 0));
        _columnsSlideShowImagesItem.put("title", new TableInfo.Column("title", "TEXT", false, 0));
        _columnsSlideShowImagesItem.put("pk", new TableInfo.Column("pk", "INTEGER", true, 1));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSlideShowImagesItem = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSlideShowImagesItem = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSlideShowImagesItem = new TableInfo("SlideShowImagesItem", _columnsSlideShowImagesItem, _foreignKeysSlideShowImagesItem, _indicesSlideShowImagesItem);
        final TableInfo _existingSlideShowImagesItem = TableInfo.read(_db, "SlideShowImagesItem");
        if (! _infoSlideShowImagesItem.equals(_existingSlideShowImagesItem)) {
          throw new IllegalStateException("Migration didn't properly handle SlideShowImagesItem(com.example.geomab.data.database.SlideShowImagesItem).\n"
                  + " Expected:\n" + _infoSlideShowImagesItem + "\n"
                  + " Found:\n" + _existingSlideShowImagesItem);
        }
      }
    }, "9a6dd119b46c1991b168ba664a1d33dd", "3231d1abbfafb95c2e3e97d694056bf3");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "Country","SlideShowImagesItem");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Country`");
      _db.execSQL("DELETE FROM `SlideShowImagesItem`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public CountryDao countryDao() {
    if (_countryDao != null) {
      return _countryDao;
    } else {
      synchronized(this) {
        if(_countryDao == null) {
          _countryDao = new CountryDao_Impl(this);
        }
        return _countryDao;
      }
    }
  }

  @Override
  public SlideShowImageDao sliderShowImagesDao() {
    if (_slideShowImageDao != null) {
      return _slideShowImageDao;
    } else {
      synchronized(this) {
        if(_slideShowImageDao == null) {
          _slideShowImageDao = new SlideShowImageDao_Impl(this);
        }
        return _slideShowImageDao;
      }
    }
  }
}
