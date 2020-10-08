package day61_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class IteratingKeysValues {

    public static void main(String[] args) {

        Map<String, LocalDate>  students =  new LinkedHashMap<>();
            students.put("Hasan",  LocalDate.of(1985,4,4));
            students.put("Jesus", LocalDate.of(1979,1,31));
            students.put("Muhtar", LocalDate.of(1985, 5,19));
            students.put("Jesus", LocalDate.of(1979,2,28));
            students.put("Muhtar", LocalDate.of(1965, 4, 3));
            students.put("John", LocalDate.of(1999, 3, 4));

        System.out.println(students);

    // applying loops to the keys
        for( String each  :  students.keySet()){
            System.out.println(each);
        }

        System.out.println("========================================");
    // applying loops to the values

        for(LocalDate each : students.values() ){
            System.out.println(each);
        }







    }

}
