package Office_Hours.Practice_11_4_2020;

import java.util.Map;

public class MapAB2 {

    public Map<String, String> mapAB2(Map<String, String> map) {

        if(map.containsKey("a") && map.containsKey("b")) {

            if(map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }

        }

        return map;

    }


}
