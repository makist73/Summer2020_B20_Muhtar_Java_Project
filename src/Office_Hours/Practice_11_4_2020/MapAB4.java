package Office_Hours.Practice_11_4_2020;

import java.util.Map;

public class MapAB4 {

    public Map<String, String> mapAB4(Map<String, String> map) {

        if(map.containsKey("a") && map.containsKey("b")) {

            String aVal = map.get("a");
            String bVal = map.get("b");

            if(aVal.length() == bVal.length()) {
                map.put("a", "");
                map.put("b", "");
            } else {

                // lengths have to different if in the else block

                String cVal = aVal.length() > bVal.length() ? aVal : bVal;
                map.put("c", cVal);

            }


        }

        return map;


    }

}
