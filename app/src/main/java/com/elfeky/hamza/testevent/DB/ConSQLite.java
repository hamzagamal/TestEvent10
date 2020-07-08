package com.elfeky.hamza.testevent.DB;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ConSQLite extends SQLiteOpenHelper {

    SQLiteDatabase myDB;
    Context con;

    public ConSQLite(Context c) {
        super(c, "testevents", null, 1);
        con=c;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE event(title VARCHAR(30),date VARCHAR(11),name VARCHAR(11),favorite INT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if(oldVersion>newVersion){
            db.execSQL("");
        }

    }

    String save(String title,String date,String name,int favorite){
        myDB = this.getWritableDatabase();
        try{

            myDB.execSQL("INSERT INTO event VALUES ('"+ title +"','"+ date +"','"+ name +"','"+ favorite +"');");
            return "Save";
        }catch(Exception e){
            return e.getMessage().toString();
        }



    }

    String update(String oldTitle ,String title,String date,String name,int favorite){
        myDB = this.getWritableDatabase();
        try{
            myDB.execSQL("UPDATE event SET title='"+title+"',date='"+date+"',name='"+ name +"',favorite='"+ favorite
                    + "' WHERE title='"+oldTitle+"';");
            return "Update";
        }catch(Exception e){
            return e.getMessage().toString();
        }
    }

    String updateFavorite(String title,int favorite){
        myDB = this.getWritableDatabase();
        try{
            myDB.execSQL("UPDATE event SET favorite='"+favorite +"' WHERE title='"+title+"';");
            return "Update";
        }catch(Exception e){
            return e.getMessage().toString();
        }
    }

    String delete(String title){
        myDB = this.getWritableDatabase();
        try{

            myDB.execSQL("DELETE FROM event WHERE title='"+title+"';");
            return "Delete";
        }catch(Exception e){
            return e.getMessage().toString();
        }
    }
    Cursor getData(){
        myDB = getReadableDatabase();
        Cursor r  = myDB.rawQuery("SELECT title,date,name,favorite FROM event WHERE 1",null);
        return r;

    }
}