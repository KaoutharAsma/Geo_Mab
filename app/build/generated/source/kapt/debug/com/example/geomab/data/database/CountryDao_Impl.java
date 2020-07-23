package com.example.geomab.data.database;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.lifecycle.ComputableLiveData;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.InvalidationTracker.Observer;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@SuppressWarnings("unchecked")
public final class CountryDao_Impl implements CountryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfCountry;

  private final SharedSQLiteStatement __preparedStmtOfSetAllSeen;

  private final SharedSQLiteStatement __preparedStmtOfSetSeen;

  public CountryDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCountry = new EntityInsertionAdapter<Country>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `Country`(`pk`,`description`,`capital`,`drapeau`,`drapeau_carre`,`historique`,`hymne`,`name`,`personnalités`,`population`,`ressources`,`surface`,`seen`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Country value) {
        stmt.bindLong(1, value.getPk());
        if (value.getDescription() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDescription());
        }
        if (value.getCapital() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCapital());
        }
        if (value.getDrapeau() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDrapeau());
        }
        if (value.getDrapeau_carre() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDrapeau_carre());
        }
        if (value.getHistorique() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getHistorique());
        }
        if (value.getHymne() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getHymne());
        }
        if (value.getName() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getName());
        }
        if (value.getPersonnalités() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getPersonnalités());
        }
        if (value.getPopulation() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getPopulation());
        }
        if (value.getRessources() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getRessources());
        }
        if (value.getSurface() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getSurface());
        }
        final int _tmp;
        _tmp = value.getSeen() ? 1 : 0;
        stmt.bindLong(13, _tmp);
      }
    };
    this.__preparedStmtOfSetAllSeen = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Update Country SET seen =0";
        return _query;
      }
    };
    this.__preparedStmtOfSetSeen = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Update Country SET seen =1 where pk = ?";
        return _query;
      }
    };
  }

  @Override
  public void addCountries(ArrayList<Country> countries) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfCountry.insert(countries);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void SetAllSeen() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetAllSeen.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetAllSeen.release(_stmt);
    }
  }

  @Override
  public void SetSeen(int id) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfSetSeen.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      _stmt.bindLong(_argIndex, id);
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfSetSeen.release(_stmt);
    }
  }

  @Override
  public LiveData<List<Country>> getCountries() {
    final String _sql = "Select * from Country";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new ComputableLiveData<List<Country>>(__db.getQueryExecutor()) {
      private Observer _observer;

      @Override
      protected List<Country> compute() {
        if (_observer == null) {
          _observer = new Observer("Country") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfPk = _cursor.getColumnIndexOrThrow("pk");
          final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("description");
          final int _cursorIndexOfCapital = _cursor.getColumnIndexOrThrow("capital");
          final int _cursorIndexOfDrapeau = _cursor.getColumnIndexOrThrow("drapeau");
          final int _cursorIndexOfDrapeauCarre = _cursor.getColumnIndexOrThrow("drapeau_carre");
          final int _cursorIndexOfHistorique = _cursor.getColumnIndexOrThrow("historique");
          final int _cursorIndexOfHymne = _cursor.getColumnIndexOrThrow("hymne");
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfPersonnalitS = _cursor.getColumnIndexOrThrow("personnalités");
          final int _cursorIndexOfPopulation = _cursor.getColumnIndexOrThrow("population");
          final int _cursorIndexOfRessources = _cursor.getColumnIndexOrThrow("ressources");
          final int _cursorIndexOfSurface = _cursor.getColumnIndexOrThrow("surface");
          final int _cursorIndexOfSeen = _cursor.getColumnIndexOrThrow("seen");
          final List<Country> _result = new ArrayList<Country>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Country _item;
            final int _tmpPk;
            _tmpPk = _cursor.getInt(_cursorIndexOfPk);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpCapital;
            _tmpCapital = _cursor.getString(_cursorIndexOfCapital);
            final String _tmpDrapeau;
            _tmpDrapeau = _cursor.getString(_cursorIndexOfDrapeau);
            final String _tmpDrapeau_carre;
            _tmpDrapeau_carre = _cursor.getString(_cursorIndexOfDrapeauCarre);
            final String _tmpHistorique;
            _tmpHistorique = _cursor.getString(_cursorIndexOfHistorique);
            final String _tmpHymne;
            _tmpHymne = _cursor.getString(_cursorIndexOfHymne);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpPersonnalités;
            _tmpPersonnalités = _cursor.getString(_cursorIndexOfPersonnalitS);
            final String _tmpPopulation;
            _tmpPopulation = _cursor.getString(_cursorIndexOfPopulation);
            final String _tmpRessources;
            _tmpRessources = _cursor.getString(_cursorIndexOfRessources);
            final String _tmpSurface;
            _tmpSurface = _cursor.getString(_cursorIndexOfSurface);
            final boolean _tmpSeen;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfSeen);
            _tmpSeen = _tmp != 0;
            _item = new Country(_tmpPk,_tmpDescription,_tmpCapital,_tmpDrapeau,_tmpDrapeau_carre,_tmpHistorique,_tmpHymne,_tmpName,_tmpPersonnalités,_tmpPopulation,_tmpRessources,_tmpSurface,_tmpSeen);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  public Country getCountry(int id) {
    final String _sql = "Select * from Country where pk = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfPk = _cursor.getColumnIndexOrThrow("pk");
      final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("description");
      final int _cursorIndexOfCapital = _cursor.getColumnIndexOrThrow("capital");
      final int _cursorIndexOfDrapeau = _cursor.getColumnIndexOrThrow("drapeau");
      final int _cursorIndexOfDrapeauCarre = _cursor.getColumnIndexOrThrow("drapeau_carre");
      final int _cursorIndexOfHistorique = _cursor.getColumnIndexOrThrow("historique");
      final int _cursorIndexOfHymne = _cursor.getColumnIndexOrThrow("hymne");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfPersonnalitS = _cursor.getColumnIndexOrThrow("personnalités");
      final int _cursorIndexOfPopulation = _cursor.getColumnIndexOrThrow("population");
      final int _cursorIndexOfRessources = _cursor.getColumnIndexOrThrow("ressources");
      final int _cursorIndexOfSurface = _cursor.getColumnIndexOrThrow("surface");
      final int _cursorIndexOfSeen = _cursor.getColumnIndexOrThrow("seen");
      final Country _result;
      if(_cursor.moveToFirst()) {
        final int _tmpPk;
        _tmpPk = _cursor.getInt(_cursorIndexOfPk);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final String _tmpCapital;
        _tmpCapital = _cursor.getString(_cursorIndexOfCapital);
        final String _tmpDrapeau;
        _tmpDrapeau = _cursor.getString(_cursorIndexOfDrapeau);
        final String _tmpDrapeau_carre;
        _tmpDrapeau_carre = _cursor.getString(_cursorIndexOfDrapeauCarre);
        final String _tmpHistorique;
        _tmpHistorique = _cursor.getString(_cursorIndexOfHistorique);
        final String _tmpHymne;
        _tmpHymne = _cursor.getString(_cursorIndexOfHymne);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpPersonnalités;
        _tmpPersonnalités = _cursor.getString(_cursorIndexOfPersonnalitS);
        final String _tmpPopulation;
        _tmpPopulation = _cursor.getString(_cursorIndexOfPopulation);
        final String _tmpRessources;
        _tmpRessources = _cursor.getString(_cursorIndexOfRessources);
        final String _tmpSurface;
        _tmpSurface = _cursor.getString(_cursorIndexOfSurface);
        final boolean _tmpSeen;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfSeen);
        _tmpSeen = _tmp != 0;
        _result = new Country(_tmpPk,_tmpDescription,_tmpCapital,_tmpDrapeau,_tmpDrapeau_carre,_tmpHistorique,_tmpHymne,_tmpName,_tmpPersonnalités,_tmpPopulation,_tmpRessources,_tmpSurface,_tmpSeen);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Country getNotSeen() {
    final String _sql = "Select * from Country where seen = 0 LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfPk = _cursor.getColumnIndexOrThrow("pk");
      final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("description");
      final int _cursorIndexOfCapital = _cursor.getColumnIndexOrThrow("capital");
      final int _cursorIndexOfDrapeau = _cursor.getColumnIndexOrThrow("drapeau");
      final int _cursorIndexOfDrapeauCarre = _cursor.getColumnIndexOrThrow("drapeau_carre");
      final int _cursorIndexOfHistorique = _cursor.getColumnIndexOrThrow("historique");
      final int _cursorIndexOfHymne = _cursor.getColumnIndexOrThrow("hymne");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfPersonnalitS = _cursor.getColumnIndexOrThrow("personnalités");
      final int _cursorIndexOfPopulation = _cursor.getColumnIndexOrThrow("population");
      final int _cursorIndexOfRessources = _cursor.getColumnIndexOrThrow("ressources");
      final int _cursorIndexOfSurface = _cursor.getColumnIndexOrThrow("surface");
      final int _cursorIndexOfSeen = _cursor.getColumnIndexOrThrow("seen");
      final Country _result;
      if(_cursor.moveToFirst()) {
        final int _tmpPk;
        _tmpPk = _cursor.getInt(_cursorIndexOfPk);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final String _tmpCapital;
        _tmpCapital = _cursor.getString(_cursorIndexOfCapital);
        final String _tmpDrapeau;
        _tmpDrapeau = _cursor.getString(_cursorIndexOfDrapeau);
        final String _tmpDrapeau_carre;
        _tmpDrapeau_carre = _cursor.getString(_cursorIndexOfDrapeauCarre);
        final String _tmpHistorique;
        _tmpHistorique = _cursor.getString(_cursorIndexOfHistorique);
        final String _tmpHymne;
        _tmpHymne = _cursor.getString(_cursorIndexOfHymne);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpPersonnalités;
        _tmpPersonnalités = _cursor.getString(_cursorIndexOfPersonnalitS);
        final String _tmpPopulation;
        _tmpPopulation = _cursor.getString(_cursorIndexOfPopulation);
        final String _tmpRessources;
        _tmpRessources = _cursor.getString(_cursorIndexOfRessources);
        final String _tmpSurface;
        _tmpSurface = _cursor.getString(_cursorIndexOfSurface);
        final boolean _tmpSeen;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfSeen);
        _tmpSeen = _tmp != 0;
        _result = new Country(_tmpPk,_tmpDescription,_tmpCapital,_tmpDrapeau,_tmpDrapeau_carre,_tmpHistorique,_tmpHymne,_tmpName,_tmpPersonnalités,_tmpPopulation,_tmpRessources,_tmpSurface,_tmpSeen);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
