package Office_Hours.Practice_07_07_2020;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //            0123456

/*
        str.charAt(6); // '0'
        str.charAt(5); // '2'
        str.charAt(4); // 'h'
        str.charAt(3); // 'c'
        str.charAt(2); // 't'
        str.charAt(1); // 'a'
        str.charAt(0); // 'B'
*/

        //02hctaB

        String result = ""; //"02hctaB"

        for(int i = str.length()-1; i >= 0; i -= 1 ){ //i: 6,5,4,3,2,1,0

             result += str.charAt(i) ;

        }

        System.out.println(result);

        System.out.println("=====================================");

        String result2 = "";
        int index = str.length()-1;

        while(index >= 0){

          result2 += str.charAt(index);

            index -= 1;
        }

        System.out.println(result2);




    }


}
