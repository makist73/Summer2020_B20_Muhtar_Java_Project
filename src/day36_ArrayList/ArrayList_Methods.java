package day36_ArrayList;

import java.util.ArrayList;

/*
    indexOf()
	lastIndexOf()
	contains()
	equals ()
	isEmpty()
 */
public class ArrayList_Methods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
            list.add(10); //0
            list.add(20); //1
            list.add(30); //2
            list.add(40); //3
            list.add(50); //4
            list.add(40); // 5

        int a = list.indexOf(40);

        System.out.println(a);

        System.out.println( list.indexOf(60)); // 60 is not exist in the list

        System.out.println(list.lastIndexOf(40));

       boolean r1 = list.contains(100);

        System.out.println(r1);


    }


}
