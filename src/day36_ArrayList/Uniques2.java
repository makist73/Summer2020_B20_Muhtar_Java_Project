package day36_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Uniques2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();  // {1,1,2,3,3}
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);

        ArrayList<Integer> uniques = new ArrayList<>(); // {2}

        for( Integer each: list){  // gets the each element from list

            int count = Collections.frequency(list, each);

            if(count == 1){  // to verify if  element is unique
                uniques.add(each);
            }

        }


        System.out.println(uniques);




    }


}
