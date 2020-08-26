package day45_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class Constructor {

    public Constructor(){
        System.out.println("No argument");
    }

    public Constructor(int a){
        System.out.println("int argument");
    }

    public Constructor(String a){
        System.out.println("String argument");
    }

    public static void main(String[] args) {

        Constructor obj1 = new Constructor("Muhtar");


     /*
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5));


        ArrayList<Integer> list2 = new ArrayList<>(list1);
        System.out.println(list2);
        */


    }



}
