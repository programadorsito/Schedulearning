package co.edu.udea.schedulearning.note;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import co.edu.udea.schedulearning.R;


public class NoteActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.note);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction().add(R.id.note_container_fragment, new NoteListFragment()).commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
    
        if (id == R.id.action_settings) {
            return true;
        }
    
        return super.onOptionsItemSelected(item);
    }
}
