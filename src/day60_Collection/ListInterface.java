package day60_Collection;

import java.util.*;

public class ListInterface {

    public static void main(String[] args) {

        List<Integer>  list1 = new ArrayList<>( );  // get, add, remove, set, removeAll, contains, size...
            list1.addAll(Arrays.asList(1,2,3,4,5));
            list1.addAll(Arrays.asList(1,2,3,4,5));

        list1.add(6);

        System.out.println("ArrayList: "+list1);
        System.out.println( list1.get(2) );  // fastest



        List<Integer> list2 = new LinkedList<>(); // get, add, remove, set, removeAll, contains, size...
            list2.addAll(Arrays.asList(1,2,3,4,5));
            list2.addAll(Arrays.asList(1,2,3,4,5));

        list2.add(6);

        System.out.println("LinkedList: "+list2);
        System.out.println(list2.get(2));


        List<Integer> list3 = new Vector<>();  // get, add, remove, set, removeAll, contains, size...
            list3.addAll(Arrays.asList(1,2,3,4,5));
            list3.addAll(Arrays.asList(1,2,3,4,5));

        list3.add(6);

        System.out.println("Vector: "+list3);
        System.out.println(list3.get(2));


        List<Integer> list4 = new Stack<>(); // get, add, remove, set, removeAll, contains, size...
            list4.addAll(Arrays.asList(1,2,3,4,5));
            list4.addAll(Arrays.asList(1,2,3,4,5));

        list4.add(6);

             System.out.println("Stack: "+list4);
            System.out.println(list4.get(2));



    }

    public void method1(){

    }

    public synchronized void method2(){

    }



}
