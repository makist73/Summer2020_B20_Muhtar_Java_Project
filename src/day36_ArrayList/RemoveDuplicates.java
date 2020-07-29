package day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
                list.add('A');
                list.add('A');
                list.add('B');
                list.add('B');
                list.add('C');
                list.add('C');
                list.add('D');

        System.out.println(list);

       ArrayList<Character>  nonDup = new ArrayList<>();    //{A, B, C, D}

        for(Character each : list){ // 'A', 'A', 'B', 'B', 'C', 'C'

            if( !nonDup.contains(each)){
                nonDup.add(each);
            }

        }


        System.out.println(nonDup);







    }

}
