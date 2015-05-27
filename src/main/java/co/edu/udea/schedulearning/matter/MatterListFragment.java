package co.edu.udea.schedulearning.matter;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import co.edu.udea.schedulearning.R;
import co.edu.udea.schedulearning.db.DB;
import co.edu.udea.schedulearning.db.SQL;
import co.edu.udea.schedulearning.utils.Utils;


public class MatterListFragment extends Fragment {
    List listMatters;
    DB db;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        db=DB.get(getActivity());
        View view=inflater.inflate(R.layout.matter_list, container, false);
        listMatters= db.findAll(Matter.class);
        ListView lv = (ListView) view.findViewById(R.id.listviewMatters);
        
        int[] to = new int[]{R.id.item_matter_name, R.id.item_matter_weight};
        
        List<HashMap<String, String>> matterMaps = new LinkedList<HashMap<String, String>>();

        for(Object obj:listMatters){
            matterMaps.add(Utils.getMatterMap((Matter)obj));
        }
        
        SimpleAdapter adapter = new SimpleAdapter(getActivity(), matterMaps, R.layout.matter_list_item, SQL.MATTER_COLUMNS, to);
        lv.setAdapter(adapter);
        return view;
    }
}
