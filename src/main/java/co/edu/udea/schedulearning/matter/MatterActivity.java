package co.edu.udea.schedulearning.matter;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import co.edu.udea.schedulearning.R;
import co.edu.udea.schedulearning.db.DB;


public class MatterActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.matter);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction().add(R.id.matter_container_fragment, new MatterListFragment()).commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.matter_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
    
        switch(id){
            case R.id.action_matter_list:
                getFragmentManager().beginTransaction().replace(R.id.matter_container_fragment, new MatterListFragment()).commit();
                break;
            case R.id.action_matter_new :
                getFragmentManager().beginTransaction().replace(R.id.matter_container_fragment, new MatterRegisterFragment()).commit();
                break;
        }
        return true;
    }
}