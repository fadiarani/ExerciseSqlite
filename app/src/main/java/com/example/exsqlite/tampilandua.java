package com.example.exsqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.provider.ContactsContract;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;

public class tampilandua extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "MyDBName.db";
    public static final String MHS_TABLE_NAME = "kontak";
    public static final String MHS_COLUMN_ID = "id";
    public static final String MHS_COLUMN_NAMA = "nama";
    public static final String MHS_COLUMN_PHONE = "nomor_telepon";
    public static final String MHS_COLUMN_EMAIL = "email";
    public static final String MHS_COLUMN_ALAMAT = "alamat";
    private HashMap hp;
    public tampilandua(Context context) {
        super(context, DATABASE_NAME , null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        db.execSQL(
                "create table kontak " +
                        "(id integer primary key,nama text,nomor_telepon text, email text, alamat text)"
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int
            newVersion) {
        // TODO Auto-generated method stub
        db.execSQL("DROP TABLE IF EXISTS kontal");
        onCreate(db);
    }
}


    /*public boolean insertContact (String nim, String nama, String
            phone) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("nama", nama);
        contentValues.put("nomor_telepon", nomor telepon);
        contentValues.put("email", );
        contentValues.put("nama", nama);
        db.insert("kontak", null, contentValues);
        return true;
    }
}
