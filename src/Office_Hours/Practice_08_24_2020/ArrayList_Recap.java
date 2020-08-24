package Office_Hours.Practice_08_24_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
addAll(CollectionType):
removeAll:
retainAll
containAll:
 */

public class ArrayList_Recap {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(   Arrays.asList(10,20,30,40,50 ) );

        System.out.println( list1  );

        for( int each  : list1){
            System.out.println(each);
        }

        System.out.println("===========================================");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll( Arrays.asList(30,40,50,60,70,80,90,100, 200) );

        // remove: 40, 50, 90, 200
        list2.removeAll( Arrays.asList(40,50,90,200) );
        System.out.println(list2);

        Collections.swap(list2 ,  0,  list2.size()-1);
        System.out.println(list2);

        System.out.println( list2.get(0) );
        System.out.println(list2.get( list2.size()-1 ));

        // arr[0]  = 300
        list2.set(0, 300);

        System.out.println(list2);

        Collections.sort(list2);

        System.out.println(list2);


        System.out.println("===============================================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll( Arrays.asList("Ahmed", "Elkem", "Cristina", "Amton", "Ahmed", "Ahmed")  );

        names.removeIf( p ->  p.equals("Ahmed") );

        System.out.println(names);


        ArrayList<Integer> grades = new ArrayList<>();
            grades.addAll( Arrays.asList(50, 65, 45, 55, 75, 85, 95, 98, 100, 87, 40, 52, 62, 35));

            grades.removeIf( p -> p < 60 );

        System.out.println(grades);


        ArrayList<String> students = new ArrayList<>();
        students.addAll( Arrays.asList("Viorel", "Askat", "Ziiadin", "Dilafruz", "Mehray", "Ziiadin"));

        // Askat, Ziiadin

        students.retainAll( Arrays.asList("Askat", "Ziiadin") );

        System.out.println(students);


    }

}
