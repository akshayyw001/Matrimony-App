package com.example.matrimony.LocalDatabase;

import android.database.Cursor;

public interface IDBCallback {
    void OnRetrieveQuerySuccess(Cursor cursor, int responseType);

    void onCreateQuerySuccess(long id, int responseType);

    void onUpdateQuerySuccess(int responseType);

    void onDeleteQuerySuccess(boolean isDelete, int responseType);
}
