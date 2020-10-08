package day61_Maps;

import java.util.LinkedHashMap;

public class MapPractice2 {

    public static void main(String[] args) {

        LinkedHashMap<String, Integer> students = new LinkedHashMap<>();
        students.put("Shakhzod", 89);
        students.put("Ceren", 95);
        students.put("Fatime", 85);
        students.put("Kalbinur", 98);
        students.put("Hanna",94);
        students.put("Jesus",74);
        students.put("Elmira",97);
        students.put("Ali",92);
        students.put("Mikri",95);
        students.put("Ali", 95 );
        students.put("Adam", 93 );
        students.put("Murat", 79 );
        students.put("Cihan", 100);
        students.put("John", 71);



        for( String  eachKey    : students.keySet()){
            Integer eachValue = students.get(eachKey);

           if(eachValue < 80){
               System.out.println(eachKey);
           }

        }







    }

}
