package Office_Hours.Practice_11_4_2020;

import java.util.Map;

public class Topping1 {

    public Map<String, String> topping1(Map<String, String> map) {

        map.put("bread", "butter");
        // butter, bread


        if(map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }

        return map;

    }

}
