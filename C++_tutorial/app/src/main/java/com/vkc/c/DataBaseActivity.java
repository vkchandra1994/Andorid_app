package com.vkc.c;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class DataBaseActivity extends SQLiteOpenHelper {
    Context context;
    public static final String DATABASE_NAME = "db_details";
    public static final int DATABASE_VERSION = 1;

    public  DataBaseActivity(Context context)
    {
        super(context,"db_details",null,1);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String qry="create table User_Details(name text,age integer,cno integer,email text,password text)";
        db.execSQL(qry);
        Toast.makeText(context,"Table create",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
