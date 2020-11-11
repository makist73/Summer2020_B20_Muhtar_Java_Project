package Office_Hours.Practice_11_4_2020;

import java.util.Map;

public class MapBully {

    public Map<String, String> mapBully(Map<String, String> map) {

        if(map.containsKey("a")) {
            String value = map.get("a");
            map.put("b", value);
            map.put("a", "");
        }

        return map;

    }



}
