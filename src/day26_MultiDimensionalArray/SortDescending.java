package day26_MultiDimensionalArray;

import java.util.Arrays;

//  1. write a program that can sort the array in descending order
public class SortDescending {

    public static void main(String[] args) {

        int[] arr ={ 10, 11, 8, 9, 12, 5, 15};
        Arrays.sort(arr); //arr: {1, 2, 3}
        System.out.println( Arrays.toString(arr));

        int[] desc = new int[arr.length];      // { 3, 2, 1}
            /*
            desc[0] =  arr[2];
             desc[1] =  arr[1];
             desc[2] =  arr[0];
        */

             int k =arr.length-1;
             for(int i =0; i <= desc.length-1; i++ ){ //i: 0, 1, 2
                 desc[i] =  arr[k];
                 k--; // k: 2, 1, 0
             }


        System.out.println(Arrays.toString(desc));

    }

}
