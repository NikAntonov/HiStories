package es.esy.histories.histories;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.util.Log;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static Context context = null;
    public static final String DATABASE_NAME = "database.db";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_SIGHTS_DATABASE_CREATE_SCRIPT = "create table if not exists"
            + " sights" + " (" + BaseColumns._ID + " integer primary key autoincrement, "
            + " name text not null, description text not null, website text not null, xAxis float " +
            "not null, yAxis float not null);";


    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TABLE_SIGHTS_DATABASE_CREATE_SCRIPT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        Log.w("SQLite", "Update from " + oldVersion + " on version " + newVersion);
        sqLiteDatabase.execSQL("DROP TABLE IF IT EXISTS sights");
        onCreate(sqLiteDatabase);
    }
}
