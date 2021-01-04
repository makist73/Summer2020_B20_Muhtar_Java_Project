package Office_Hours.Practice_11_11_2020;

import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public Map<String, Integer> wordCount(String[] strings) {

        Map<String, Integer> map = new HashMap<>();

        for(String letter: strings) {

            if(!map.containsKey(letter)) {
                map.put(letter, 0);
            }

            map.put(letter, map.get(letter) + 1);

            // map.put("a", map.get("a") + 1);

        }

        return map;

    }

}
