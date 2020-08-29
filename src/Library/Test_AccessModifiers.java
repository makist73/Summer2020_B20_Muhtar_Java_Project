package Library;

import day47_Encapsulation.AccessModifiers;

public class Test_AccessModifiers {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicVariable); // public is visible at every where
        AccessModifiers.publicMethod();


       // System.out.println( AccessModifiers.defaultVariable ); // default is not accessible outside the package
      //  AccessModifiers.defaultMethod();



    }


}
