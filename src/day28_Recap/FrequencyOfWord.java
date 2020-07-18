package day28_Recap;
//  1. write a program return the frequency of a word from a string

public class FrequencyOfWord {

    public static void main(String[] args) {
        String str = "javajava";
        //            01234567

        //substring(0, 4) ==> java
       // substring(1, 5) ==> avaj
       // substring(2, 6) ==> vaja
        // substring(3, 7) ==> ajav
        // substring(4, 8) ==> java

        //substring(i, i+4)

        //"java"

        int count = 0;
        for(int i= 0 ; i <= str.length()-4; i++){ //i:0 , 1, 2,3, 4

            String s = str.substring(i, i+4);
            if(s.equalsIgnoreCase("java")){
                count++;
            }

        }

        System.out.println(count);



    }

}
