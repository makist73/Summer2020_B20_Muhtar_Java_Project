package Office_Hours.Practice_11_11_2020;

import java.util.HashMap;
import java.util.Map;

public class FirstChar {

    public Map<String, String> firstChar(String[] strings) {

        Map<String, String> map = new HashMap<>();

        for(String word : strings) {
            String key = word.substring(0,1);

            if(!map.containsKey(key)){
                map.put(key, word); // intital value
            } else {
                map.put(key, map.get(key) + word); // updating the value
            }

        }

        return map;
    }

}
