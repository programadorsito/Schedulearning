package co.edu.udea.schedulearning.utils;

import java.util.HashMap;
import java.util.Map;

import co.edu.udea.schedulearning.matter.Matter;

public class Utils{
    public static HashMap<String, String> getMatterMap(Matter matter){
        HashMap<String, String> map=new HashMap<String, String>();
        map.put("name", matter.getName());
        map.put("weight", matter.getWeight()+"");
        return map;
    }
}