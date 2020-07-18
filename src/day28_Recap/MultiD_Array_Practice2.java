package day28_Recap;
/*
    int arr2D[][] = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
            task1:
                9 10 11 12 13
                4 5 6 7 8
                1 2 3
            task2:
                3 2 1
                4 5 6 7 8
                9 10, 11 12 13
            task3:
                13 12 11 10 9
                8 7 6 5 4
                3 2 1
 */

import java.util.Arrays;

public class MultiD_Array_Practice2 {

    public static void main(String[] args) {
        //                 0 1 2      0 1 2 3 4      0 1  2  3  4
        int arr2D[][] = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
        //                  0            1               2
        /*
         task1:
                9 10 11 12 13
                4 5 6 7 8
                1 2 3
         */

        for(int i = arr2D.length-1; i >=0; i-- ){
            int[] arr1D = arr2D[i];
           for( int j = 0; j <= arr1D.length-1; j++ ){
               System.out.print(arr1D[j]+" ");
           }
            System.out.println();
        }

        System.out.println("=======================================");
        /*
        task2:
                3 2 1
                8 7 6 5 4
                13 12 11 10 9
         */

        for(int i= 0; i <= arr2D.length-1; i++){
            int[] arr1D = arr2D[i];
            for(int j = arr1D.length-1; j >= 0; j--){
                System.out.print( arr1D[j] +" ");
            }
            System.out.println();
        }

        System.out.println("=============================================");
        /*
        task3:
                13 12 11 10 9
                8 7 6 5 4
                3 2 1
         */

        for(int i = arr2D.length-1; i >=0 ; i-- ){
            int[] arr1D = arr2D[i];
            for(int j=arr1D.length-1; j >= 0; j-- ){
                System.out.print(arr1D[j]+" ");
            }
            System.out.println();
        }


    }
}
