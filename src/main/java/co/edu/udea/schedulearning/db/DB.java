package co.edu.udea.schedulearning.db;


import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import java.util.LinkedList;
import java.util.List;

import co.edu.udea.schedulearning.matter.Matter;
import co.edu.udea.schedulearning.note.Note;
import co.edu.udea.schedulearning.schedule.Schedule;


/**
 * Created by dmolina on 20/04/2015.
 */
public class DB {

    public static DB get(Context context) {
        if (database == null) {
            database = new DB(context);
        }
        return database;
    }

    private static DB database;

    private SQLiteDatabase in, out;
    private Sqlite sqlite;

    private DB(Context context) {
        sqlite = new Sqlite(context, "test", 3);
        in = sqlite.getReadableDatabase();
        out = sqlite.getWritableDatabase();
    }

    public boolean save(Object obj) {
        try {
            if (obj instanceof Matter) {
                Matter materia = (Matter) obj;
                out.execSQL(SQL.insertMatter(materia.getName(), materia.getWeight()));
            } else if (obj instanceof Schedule) {

            } else if (obj instanceof Note) {

            }
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(Object obj) {
        try {
//            if(obj instanceof Materia){
//                //todo
//            }
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List findAll(Class clase) {
        List lista = new LinkedList();
        if (clase == Matter.class) {
            Cursor cursor = in.query("MATTER", SQL.MATTER_COLUMNS, null, null, null, null, null);
            cursor.moveToFirst();
            while (cursor.moveToNext()) {
                lista.add(new Matter(cursor.getString(0), cursor.getInt(1), 0));
            }
        }
        return lista;
    }
}
