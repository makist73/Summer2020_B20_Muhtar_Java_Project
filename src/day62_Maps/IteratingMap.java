package day62_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingMap {

    public static void main(String[] args) {

        Map<String, LocalDate> map =  new LinkedHashMap<>();
        map.put("John", LocalDate.of(1999,8,9));
        map.put("Aaron", LocalDate.of(1998,5,9));
        map.put("Daniel", LocalDate.of(1997,4,9));
        map.put("James", LocalDate.of(1996,2,9));
        map.put("Caleb", LocalDate.of(1995,3,9));
        map.put("Erik", LocalDate.of(1989,1,9));

        System.out.println(map);


    }

}
