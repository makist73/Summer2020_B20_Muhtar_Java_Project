package Office_Hours.Practice_08_24_2020;

import java.util.Arrays;

public class Array_Recap2 {

    public static void main(String[] args) {

        int[] nums = {2,3,4,5,6,7,8};

        for(int  each : nums ){
            if(each % 3 != 0){
               continue;
            }

            System.out.println(each);
        }

        System.out.println("========================================");

        String[] names = {"Mawlan", "Memetjan", "Nickolas", "Elkem", "Aysen"};

        for( String each  : names ){
            if( each.toLowerCase().contains("m")  ){
                System.out.println(each);
            }
        }


        System.out.println(  Arrays.toString(  names )    );

        System.out.println("====================================================");

        int[] arr1 = {89,79,400,0, -100, -200, 59};
        Arrays.sort(arr1);

        System.out.println( Arrays.toString(arr1) );

        String[] students = {"Mawlan", "Memetjan", "Askat" ,"Nickolas", "Elkem", "Aysen"};
        Arrays.sort(students);

        System.out.println(Arrays.toString(students));


        System.out.println("===============================================");

        int[] a1 = {1,2,3,4};
        int[] a2 = {1,2,4,3};
        System.out.println(  Arrays.equals(a1,a2)   );  // checks elements at each indexes one by one

        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println(  Arrays.equals(a1,a2)   );





    }

}
