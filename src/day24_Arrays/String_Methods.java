package day24_Arrays;

import java.util.Arrays;

public class String_Methods {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJ";
        char[] ch = str.toCharArray();

        System.out.println( Arrays.toString(ch ) );

        System.out.println("===========================");
        String str1 = "DCEBAF";
        String str2 = "ADCBE";

        char[] ch1 = str1.toCharArray(); // [D, C, E, B, A]
        char[] ch2 = str2.toCharArray(); // [A, D, C, B, E]

        Arrays.sort(ch1); //[A, B, C, D, E]
        Arrays.sort(ch2); //[A, B, C, D, E]

        boolean r1 = Arrays.equals(ch1, ch2);
        System.out.println(r1);





    }
}
