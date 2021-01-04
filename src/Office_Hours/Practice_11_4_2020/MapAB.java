package Office_Hours.Practice_11_4_2020;

import java.util.Map;

public class MapAB {

    public Map<String, String> mapAB(Map<String, String> map) {

        if(map.containsKey("a") && map.containsKey("b")) {
            String aVal = map.get("a");
            String bVal = map.get("b");
            map.put("ab", aVal + bVal);
        }

        return map;
    }

}
