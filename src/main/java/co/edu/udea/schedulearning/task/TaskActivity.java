package co.edu.udea.schedulearning.task;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import co.edu.udea.schedulearning.R;


public class TaskActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction().add(R.id.task_container_fragment, new TaskListFragment()).commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.task_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
//            case 0:continue;
        }

        return super.onOptionsItemSelected(item);
    }
}
