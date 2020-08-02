package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practice {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("Sayeem");
        students.add("Waqar");
        students.add("Beslan");
        students.add("Dawud");
        students.add("Ramazan");
        students.add("Mehary");



        // verify that the names Ulku, Busra are contained in students list
        boolean r1 = students.containsAll(  Arrays.asList("Ulku", "Busra", "Muhtar")   );

        System.out.println(r1);

        System.out.println("==================================================");

        ArrayList<String> group1 = new ArrayList<>();

        // add all student names in your group
        group1.addAll(  Arrays.asList( "Muhtar", "Nadir", "Asiya", "Saim" ) );

        System.out.println(group1);


        // verify your mentor and one of your closest friend' names are contained in the list
        boolean r2 = group1.containsAll( Arrays.asList("Murodil", "Kuzzat") );

        System.out.println(r2);


        System.out.println("====================================================");

        ArrayList<String> employees =new ArrayList<>();
        employees.addAll( Arrays.asList( "Ahmed", "Muhtar", "Ahmed", "Virginia", "Beslan", "Ibrahim", "Ahmed") );

        System.out.println(employees);

        employees.retainAll(  Arrays.asList("Ahmed", "Dawud")  );
        System.out.println(employees);



    }

}
