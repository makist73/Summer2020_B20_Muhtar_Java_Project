package day60_Collection;

import day54_Abstraction.CarTask.Car;

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

        ( (Stack)list4 ).pop();

        System.out.println(list4);

        System.out.println("============================================");

        Stack<Integer> list5 = new Stack<>();
        list5.addAll(Arrays.asList(1,2,3,4,5,6,7));

        System.out.println(list5);

        int lastObject = list5.pop();

        System.out.println(list5);

        int lastObject2 = list5.pop();

        System.out.println(list5);

        list5.removeAll(Arrays.asList(1,4,5));
        System.out.println(list5);

        int lastObject3 = list5.pop();

        System.out.println(list5);

        System.out.println("====================================================");

        int[] arr1 = {1,2,3,4};
        int[][] arr2 = { {1,2,3,4}, {5,6,7,8,9} }; // multidimensional

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("A");


        ArrayList<ArrayList<Integer>>  l2 = new ArrayList<>();  // list of lists
             //   l2.add("M");
             //   l2.add(5);

            l2.add(  new ArrayList<>( Arrays.asList(1,2,3,4))    );
            l2.add( new ArrayList<>( ) );

            l2.get(1).addAll( Arrays.asList(5,6,7,8,9) );

            l2.get(0).removeAll(Arrays.asList(1,3));

        System.out.println(l2);
        System.out.println("Size of first arrayList: " + l2.get(0).size() );
        System.out.println("Size of second arrayList: " + l2.get(1).size() );

        System.out.println("======================================================");

        List< List<String> >  groups = new ArrayList<>();
        groups.addAll( Arrays.asList(
                new Stack<>(), new Stack<>(),
                new Stack<>(), new Stack<>(),
                new Stack<>()));

        groups.get(0).addAll( Arrays.asList( "Alexey","Ana","Andrei","Busra Y","Busra O"    ));
        groups.get(1).addAll( Arrays.asList("Nickolas","Evgeniya","Aizhan","Kalbinur","Paola"));
        groups.get(2).addAll( Arrays.asList("Ceren","Elizaveta","Heydar","Hunisddin","Kalbinur"));
        groups.get(3).addAll( Arrays.asList("Murat", "Ayhan", "Uros", "Aysel", "Esra"));
        groups.get(4).addAll( Arrays.asList("Ashenafi", "Ali", "Hamid", "Mokinur", "Nikola"));

        for( List<String>  eachGroup : groups ){
            ( (Stack)eachGroup ).pop();
            System.out.println(eachGroup);
        }



      // System.out.println(groups);

        /*
        1. add 5 different names in each group
        2. iterate the list of lists (groups)
        3. print out the names of each student

         */

        List<Car> SUVs = new ArrayList<>();
        List<Car> sedans = new ArrayList<>();
        List<Car> truck = new ArrayList<>();
        List<Car> convertible = new ArrayList<>();



        List< List<Car> >  cars = new ArrayList<>();

        /*
        iterate every single car and print out the:
            brand : model : price
         */







    }

    public void method1(){

    }

    public synchronized void method2(){

    }



}
