package com.example.wynsean.petdatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class PhoneDatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "pet"; // the name of our database
    private static final int DB_VERSION = 2; // the version of the database

    PhoneDatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        updateMyDatabase(db, 0, DB_VERSION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        updateMyDatabase(db, oldVersion, newVersion);
    }

    private void updateMyDatabase(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion < 1) {
            db.execSQL("CREATE TABLE DOG (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + "NAME TEXT, "
                    + "DESCRIPTION TEXT, "
                    + "IMAGE_RESOURCE_ID INTEGER);");
            insertDrink(db, "iMac", "\nThe iMac is a range of all-in-one Macintosh desktop computers designed and built by Apple Inc. It has been the primary part of Apple's consumer desktop offerings since its debut in August 1998 (shipped; introduced June 1998), and has evolved through six distinct forms.", R.drawable.imac);

            insertDrink(db, "Macbook Air", "\nThe MacBook Air is a line of Macintosh ultraportable notebook computers from Apple Inc. The Air was designed to balance both performance and portability, consisting of a full-sized keyboard design, a machined casing made of aluminum, and a very light and thin structure. The MacBook Air is available in two sizes, with the length of the diagonal display determining the model size: 13.3-inch and 11.6-inch (or 33.78 cm and 29.46 cm, respectively). A range of model choices with different specifications are produced by Apple, and as of 2011, all Air models use solid-state drive (SSD) storage and Intel Core i5 or i7 central processing units (CPUs).", R.drawable.macair);
        }
        insertDrink(db, "Macbook Pro", "\nThe MacBook Pro (sometimes abbreviated MBP) is a line of Macintosh portable computers introduced in January 2006 by Apple Inc., now in its third generation. Replacing the PowerBook G4, the MacBook Pro was the second model to be announced in the Apple–Intel transition, after the iMac. It is the high-end model of the MacBook family and is currently produced with 13- and 15-inch screens. A 17-inch version was available in the past.", R.drawable.macpro);

        if (oldVersion < 2) {
            db.execSQL("ALTER TABLE DRINK ADD COLUMN FAVORITE NUMERIC;");
        }
    }

    private static void insertDrink(SQLiteDatabase db, String name,
                                    String description, int resourceId) {
        ContentValues dogValues = new ContentValues();
        dogValues.put("NAME", name);
        dogValues.put("DESCRIPTION", description);
        dogValues.put("IMAGE_RESOURCE_ID", resourceId);
        db.insert("DOG", null, dogValues);
    }
}

