package com.example.geomab.data.database;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.lifecycle.ComputableLiveData;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.InvalidationTracker.Observer;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@SuppressWarnings("unchecked")
public final class SlideShowImageDao_Impl implements SlideShowImageDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfSlideShowImagesItem;

  public SlideShowImageDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSlideShowImagesItem = new EntityInsertionAdapter<SlideShowImagesItem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `SlideShowImagesItem`(`country`,`image`,`title`,`pk`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SlideShowImagesItem value) {
        stmt.bindLong(1, value.getCountry());
        if (value.getImage() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getImage());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        stmt.bindLong(4, value.getPk());
      }
    };
  }

  @Override
  public void addSlideShowImages(ArrayList<SlideShowImagesItem> images) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfSlideShowImagesItem.insert(images);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<SlideShowImagesItem>> getSlideShowImages() {
    final String _sql = "Select * from SlideShowImagesItem";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new ComputableLiveData<List<SlideShowImagesItem>>(__db.getQueryExecutor()) {
      private Observer _observer;

      @Override
      protected List<SlideShowImagesItem> compute() {
        if (_observer == null) {
          _observer = new Observer("SlideShowImagesItem") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfCountry = _cursor.getColumnIndexOrThrow("country");
          final int _cursorIndexOfImage = _cursor.getColumnIndexOrThrow("image");
          final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
          final int _cursorIndexOfPk = _cursor.getColumnIndexOrThrow("pk");
          final List<SlideShowImagesItem> _result = new ArrayList<SlideShowImagesItem>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SlideShowImagesItem _item;
            final int _tmpCountry;
            _tmpCountry = _cursor.getInt(_cursorIndexOfCountry);
            final String _tmpImage;
            _tmpImage = _cursor.getString(_cursorIndexOfImage);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final int _tmpPk;
            _tmpPk = _cursor.getInt(_cursorIndexOfPk);
            _item = new SlideShowImagesItem(_tmpCountry,_tmpImage,_tmpTitle,_tmpPk);
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
  public SlideShowImagesItem getSlideShowImage(int id) {
    final String _sql = "Select * from SlideShowImagesItem where pk = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfCountry = _cursor.getColumnIndexOrThrow("country");
      final int _cursorIndexOfImage = _cursor.getColumnIndexOrThrow("image");
      final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
      final int _cursorIndexOfPk = _cursor.getColumnIndexOrThrow("pk");
      final SlideShowImagesItem _result;
      if(_cursor.moveToFirst()) {
        final int _tmpCountry;
        _tmpCountry = _cursor.getInt(_cursorIndexOfCountry);
        final String _tmpImage;
        _tmpImage = _cursor.getString(_cursorIndexOfImage);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        final int _tmpPk;
        _tmpPk = _cursor.getInt(_cursorIndexOfPk);
        _result = new SlideShowImagesItem(_tmpCountry,_tmpImage,_tmpTitle,_tmpPk);
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
  public LiveData<List<SlideShowImagesItem>> getSlideShowImageByCountry(int id) {
    final String _sql = "Select * from SlideShowImagesItem where country = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return new ComputableLiveData<List<SlideShowImagesItem>>(__db.getQueryExecutor()) {
      private Observer _observer;

      @Override
      protected List<SlideShowImagesItem> compute() {
        if (_observer == null) {
          _observer = new Observer("SlideShowImagesItem") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfCountry = _cursor.getColumnIndexOrThrow("country");
          final int _cursorIndexOfImage = _cursor.getColumnIndexOrThrow("image");
          final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
          final int _cursorIndexOfPk = _cursor.getColumnIndexOrThrow("pk");
          final List<SlideShowImagesItem> _result = new ArrayList<SlideShowImagesItem>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SlideShowImagesItem _item;
            final int _tmpCountry;
            _tmpCountry = _cursor.getInt(_cursorIndexOfCountry);
            final String _tmpImage;
            _tmpImage = _cursor.getString(_cursorIndexOfImage);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final int _tmpPk;
            _tmpPk = _cursor.getInt(_cursorIndexOfPk);
            _item = new SlideShowImagesItem(_tmpCountry,_tmpImage,_tmpTitle,_tmpPk);
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
}
