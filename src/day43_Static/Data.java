package day43_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class Data {

    static int[] arr = new int[3];  // 1,2,3
    static ArrayList<Integer> list = new ArrayList<>();  // 4,5,6

    static{

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        list.add(4);
        list.add(5);
        list.add(6);


    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(arr)); //[1,2,3]
        System.out.println(list); //[4,5,6]

    }

}
