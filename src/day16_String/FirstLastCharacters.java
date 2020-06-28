package day16_String;
/*
    2. Ask user to enter a word. Print true is the first and last characters of the string are same characters, print false otherwise.
            Input:
                abba
            Output:
                true
 */

import java.util.Scanner;

public class FirstLastCharacters {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        scan.close();

        char firstChar = word.charAt(0);
        char lastChar = word.charAt( word.length()  - 1   );

       // System.out.println( firstChar == lastChar );

        if(firstChar == lastChar ){
            System.out.println(true);
        }else{
            System.out.println(false);
        }


    }

}
