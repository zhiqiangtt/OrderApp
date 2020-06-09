package com.example.orderapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class OrderDataHelper extends SQLiteOpenHelper {

    /**
     * 声明一个数据库变量db
     * 这个数据库即SQL Lite
     * 是Android SDK中自带的数据库
     */

    public static final String CREATE_ORDER = "create table order ("
            + "id integer primary key autoincrement,"
            + "name text,"
            + "price real,"
            + "quantity integer)";

    private Context mContext;



    public OrderDataHelper(Context context, String name,
                           SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_ORDER);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }



}
