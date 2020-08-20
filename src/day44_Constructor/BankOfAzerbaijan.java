package day44_Constructor;

import java.util.ArrayList;
import java.util.Arrays;
//import static day44_Constructor.HumanResource.*;   // imports all statics from HumanResource

public class BankOfAzerbaijan {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();
        /*
        list.add( HumanResource.employee1 );
        list.add( HumanResource.employee3 );
        list.add( HumanResource.employee5 );
         */

        /*
        list.addAll( Arrays.asList( employee1, employee2, employee3  )  );
                // by using static import we are able to import the static members, so can call them withou the class name
        */

        list.addAll(  Arrays.asList( HumanResource.employee1, HumanResource.employee2, HumanResource.employee3) );

        System.out.println("Total Number of employees: "+list.size());

        System.out.println("======================================================");

        for(Employee each  : list){
            System.out.println(each.name +" : "+each.salary);
        }


    }

}
