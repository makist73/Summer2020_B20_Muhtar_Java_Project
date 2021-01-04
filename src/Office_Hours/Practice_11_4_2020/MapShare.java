package Office_Hours.Practice_11_4_2020;

import java.util.Map;

public class MapShare {


    public Map<String, String> mapShare(Map<String, String> map) {

        map.remove("c");

        if(map.containsKey("a")) {
            map.put("b", map.get("a"));
        }

        return map;

    }



}
