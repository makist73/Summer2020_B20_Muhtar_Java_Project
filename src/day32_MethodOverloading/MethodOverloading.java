package day32_MethodOverloading;

import java.util.Arrays;

public class MethodOverloading {


    public static void main(String[] args) {
        int[] arr = {9,8,7};
        Arrays.sort(arr);

        String[] names = {"D", "C", "B"};
        Arrays.sort(names);

    }

    public static void method(int a){

    }

    public static void method(double c){

    }

}
