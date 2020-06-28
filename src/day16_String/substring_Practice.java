package day16_String;
/*
1. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */


import java.util.Scanner;

public class substring_Practice {
    public static void main(String[] args) {
        // extra task:
            String str = "I like to drink Pepsi";
            String drink = str.substring(16);
            System.out.println(drink);

            String action = str.substring(10, 14 + 1);
        System.out.println(action);


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first word");
        String str1 =  scan.next();  // "Apple"

        System.out.println("Enter your second word");
        String str2 =  scan.next(); // "Banana"

        // ppleanana
       // String result =   str1.substring(1).concat(  str2.substring(1)   );
         String result = str1.substring(1) + str2.substring(1);
        System.out.println(result);


    }

}
