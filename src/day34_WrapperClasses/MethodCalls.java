package day34_WrapperClasses;

import Library.Util;

import java.util.Arrays;

public class MethodCalls {

    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4};
        Integer[] arr2 = {5,6,7,8};

        Integer[] arr3 = Util.combine2Arrays(arr1, arr2);

        System.out.println(Arrays.toString(arr3) );

        Integer max = Util.maxNum(arr3);

        System.out.println(max);

        int min = Util.minNum(arr3);  // unboxing

        System.out.println(min);

        Character[] ch = {'A', 'A', 'C', 'B', 'B', 'D'};
        ch = Util.sortDesc(ch);

        System.out.println(Arrays.toString(ch));


    }

}
