package Office_Hours.Practice_11_11_2020;

import java.util.HashMap;
import java.util.Map;

public class WordAppend {

    public String wordAppend(String[] strings) {

    /*

      b -> 1
      c -> 1
      d -> 1

      result = aa

    */


        String result = "";
        Map<String, Integer> map = new HashMap<>();

        for(String each : strings) {

            if(!map.containsKey(each)) {
                map.put(each, 1);
            } else {
                result += each;
                map.remove(each);
            }
        }

        return result;
    }


}
