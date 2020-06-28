package day16_String;
/*
  3. write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself

    4. Write a program  for CheckWords:
        Program accepts 3 words and :
            - if they are same length:      print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
 */

import java.util.Scanner;

public class CheckWords {

    public static void main(String[] args) {
        String str = "ABC";
            // last index =  length -1
            // second last index = length -2
           // third last index = length -3

        if(str.length() == 0){
            System.out.println("empty string");
        }else if(str.length() > 3){
            System.out.println( str.substring( str.length()-3 )   );
        }else{
            System.out.println(str);
        }

        String result =  (str.length() == 0) ? "empty string"
                        : (str.length() > 3) ? str.substring( str.length()-3 ) : str ;


        System.out.println(result);

        System.out.println("===================================================");
        String str1 = "abcd";
        String str2 = "abcd";
        String str3 =  "abcd";

        boolean allSame = str1.length() == str2.length() && str1.length() == str3.length();
        boolean allDifferent = str1.length() != str2.length() && str2.length() != str3.length() && str1.length() != str3.length();

        if( allSame ){
            System.out.println("All words are same length");
        }else if(allDifferent){
            System.out.println("All different length");
        }else{
            System.out.println("Not Same nor Different lengths");
        }




    }



}
