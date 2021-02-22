package com.database;

import com.model.users;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLhelper extends SQLiteOpenHelper{

	Context context;
	String dbname;
	
	public SQLhelper(Context context, String name, CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
		this.context = context;
		this.dbname = name;
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(new Users().CREATE_TABLE_USER);
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
	}

	public boolean insertContact (String name, String phone, String email, String street,String place) {
	      SQLiteDatabase db = this.getWritableDatabase();
	      ContentValues contentValues = new ContentValues();
	      public String TABLE_NAME = "USER";
	  	public String COLUMN_ID_USER = "ID";
	  	public String COLUMN_USERNAME_USER = "USERNAME";
	  	public String COLUMN_PASSWORD_USER = "PASSWORD";
	  	public String COLUMN_TYPE_USER = "TYPE";
	      contentValues.put(new users()., name);
	      contentValues.put("phone", phone);
	      contentValues.put("email", email);	
	      contentValues.put("street", street);
	      contentValues.put("place", place);
	      db.insert("contacts", null, contentValues);
	      return true;
	
}
