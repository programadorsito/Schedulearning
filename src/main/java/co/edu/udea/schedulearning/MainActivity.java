package co.edu.udea.schedulearning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import co.edu.udea.schedulearning.matter.MatterActivity;
import co.edu.udea.schedulearning.note.NoteActivity;
import co.edu.udea.schedulearning.schedule.ScheduleActivity;
import co.edu.udea.schedulearning.task.TaskActivity;


public class MainActivity extends ActionBarActivity {

    private static final String CLASS = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = null;

        switch (item.getItemId()) {
            case R.id.tasks_option:
                intent = new Intent(this, TaskActivity.class);
                break;
            case R.id.schedules_option:
                intent = new Intent(this, ScheduleActivity.class);
                break;
            case R.id.notes_option:
                intent = new Intent(this, NoteActivity.class);
                break;
            case R.id.matters_option:
                Log.d(CLASS, "Seleccionada la opcion de materias");
                intent = new Intent(this, MatterActivity.class);
                break;
        }

        if (intent != null)
            startActivity(intent);

        return super.onOptionsItemSelected(item);
    }
}
