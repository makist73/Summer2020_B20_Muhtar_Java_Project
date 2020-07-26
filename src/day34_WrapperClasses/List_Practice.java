package day34_WrapperClasses;

import java.util.ArrayList;

public class List_Practice {

    public static void main(String[] args) {
        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();

        for(int i = 0; i <= 100; i++){
            if(i%2==0){
                evenList.add(i);
            }else{
                oddList.add(i);
            }

        }

        System.out.println(oddList);
        System.out.println();
        System.out.println(evenList);


    }

}
