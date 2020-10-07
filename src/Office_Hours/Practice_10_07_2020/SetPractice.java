package Office_Hours.Practice_10_07_2020;

import java.util.*;

public class SetPractice {

    public static void main(String[] args) {
       // String str = null;
        //System.out.println(str.toUpperCase());

        String[] names = {  "Dawud", "Selman", "Aslan","Aslan","Aslan","Aslan","Aslan","Aslan","Aslan","Aslan","Aslan","Aslan","Aslan","Aslan","Aslan"};


        Set<String> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(names) ); // random
        System.out.println("Hash Set: "+hashSet);

        // System.out.println( hashSet.get(2) ); // set does not have index


        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(  Arrays.asList(names) );  // keeps the insertion order as it is
        System.out.println("Linked Hash Set: "+linkedHashSet);


        Set<String> treeSet = new TreeSet<>();
        treeSet.addAll( Arrays.asList(names) ); // ALWAYS sorts objects, in ascending order
        System.out.println("Tree Set: "+treeSet);



    }

}
