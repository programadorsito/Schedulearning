package co.edu.udea.schedulearning.db;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by dmolina on 20/04/2015.
 */
public class Sqlite extends SQLiteOpenHelper{
    public Sqlite(Context context, String databaseName, int version) {
        super(context, databaseName, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL.CREATE_TABLA_SCHEDULE);
        db.execSQL(SQL.CREATE_TABLA_MATTER);
        db.execSQL(SQL.CREATE_TABLA_NOTE);
        db.execSQL(SQL.CREATE_TABLA_TASK);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL.DROP_TABLA_SCHEDULE);
        db.execSQL(SQL.DROP_TABLA_MATTER);
        db.execSQL(SQL.DROP_TABLA_NOTE);
        db.execSQL(SQL.DROP_TABLA_TASK);
    }
}
