package Office_Hours.Practice_07_15_2020;

import java.util.Scanner;

public class FrequencyOfWords2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().toLowerCase();

      //  String str = "JavajavaJavajavaJAVA".toLowerCase() ;
     //   str =str.toLowerCase();  // str = "javajavajavajavajava"
                                  // str = "javajavajavajava"
                                  // str = "javajavajava"
                                 //  str = "javajava"
                                // str = "java"
                                // str = ""

        int count = 0; // 1+1+1+1+1
       while(str.contains("java")){ // true  true  true true  true false
            count++; // increases the count by 1
            str = str.replaceFirst("java", "" ); // removes one java from string
        }

        System.out.println(count);


    }

}
