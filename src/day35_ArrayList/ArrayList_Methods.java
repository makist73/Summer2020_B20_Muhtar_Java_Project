package day35_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {

    public static void main(String[] args) {
        ArrayList<String> earlyBirdList = new ArrayList<>();
                earlyBirdList.add("Ibrahim");
                earlyBirdList.add("Virginia");
                earlyBirdList.add("Ziiadin");
                earlyBirdList.add("Erfan");
                earlyBirdList.add("Aalia");


           earlyBirdList.set(2, "Aslan");
           earlyBirdList.set(0, "lan");

        System.out.println(earlyBirdList);

        earlyBirdList.clear();

        System.out.println(earlyBirdList);
        System.out.println( earlyBirdList.size());

        System.out.println("===========================================");

    // remove(int index)
        ArrayList<Integer> list = new ArrayList<>();
            list.add(1);  //0
            list.add(2);  //1
            list.add(3);  //2
            list.add(4);  //3
            list.add(5); // 4

            list.remove(2);  //[1, 2, 4, 5]
            //list.remove(4);
            list.remove(3); // [1, 2, 4]

        System.out.println(list);

        System.out.println("===============================================");

    // remove(Element)
        ArrayList<Integer> list2 = new ArrayList<>();
            list2.add(1);  //0
            list2.add(2);  //1
            list2.add(3);  //2
            list2.add(4);  //3
            list2.add(5); // 4

       // int a = 1; // [1, 3, 4, 5]

        Integer a = 1; //[2, 3, 4, 5]

        list2.remove(a);

        System.out.println(list2);



    }

}
