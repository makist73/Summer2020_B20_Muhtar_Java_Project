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


    }

}
