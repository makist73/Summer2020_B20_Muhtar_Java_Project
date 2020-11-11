package Office_Hours.Practice_11_11_2020;

import java.util.HashMap;
import java.util.Map;

public class AllSwap {

    public String[] allSwap(String[] strings) {

  /*
  "ax", "by", "cy", "cx", "bx", "ay",

  map:
    a -> 0



  */

        Map<Character, Integer> map = new HashMap<>(); // Help us keep track of each elements and index

        for(int i=0; i < strings.length; i++) {

            char key = strings[i].charAt(0);

            if(!map.containsKey(key)){
                map.put(key, i);
            } else {

                String temp = strings[i]; // by
                strings[i] = strings[ map.get(key) ]; // strings[4] = strings[1]
                strings[ map.get(key) ] = temp;     // strings[1] = by
                map.remove(key);

            }

        }

        return strings;
    }

// c:
// temp = cy
// strings[3] = strings[2]
// strings[2]  = temp




}
