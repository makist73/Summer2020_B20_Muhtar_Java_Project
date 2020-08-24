package Office_Hours.Practice_08_24_2020;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Recap {
    /*
    Array
    Collection
    Map

    Arrays Utility:
           toString: to print array
           sort: ascending order
           equals: compares two arrays
           asList:  to convert Object Arrays to Collection Type

     */
    public static void main(String[] args) {

        int[] arr1 = new int[5];  // index: 0,1,2,3,4
      //  System.out.println(arr1);
            arr1[0] = 10;
            arr1[ arr1.length-1 ]  = 20;
                    //5-1 = 4
        System.out.println(  Arrays.toString(arr1) );


        int[] arr2 = {1,2,3,4,5};
        //            0 1 2 3 4
        System.out.println( Arrays.toString(arr2) );

        System.out.println( arr2[4] * arr2[1] );
        //                   5      *  2   = 10

        System.out.println( arr2[0]  *  arr2[ arr2.length -1 ]);
        //                   1       *     5            =  5

        System.out.println("============================================");
        Scanner scan = new Scanner(System.in);
        String[] names = new String[5]; // index: 0, 1, 2, 3, 4

        /*
        for(int i = 0; i <= names.length-1; i++){ // i: 0, 1, 2, 3, 4
            System.out.println("Enter a name");
            names[i] = scan.nextLine();
        }
         */

        for(int i = names.length-1; i >= 0; i-=1){ // i: 4 3 2 1 0
            System.out.println("Enter a name");
            names[i] = scan.nextLine();
        }


        System.out.println( Arrays.toString(names) );





    }


}
