package day17_StringReview;

public class String_Methods2 {
     /*
    String methods:  equals, equalsIgnorecase, isEmpty, ends, starts, contains
     */

    public static void main(String[] args) {
        String s1 = "Cat";  // String pool
        String s2 = new String("Cat"); // heap
        String s3 =  new String("Cat");

        //equals: case sensitive
        System.out.println(s1 == s2); // false
        System.out.println( s1.equals(s2) );  // true

        System.out.println(s2 == s3);  // false
        System.out.println( s2.equals(s3) );  // true

        // equalsIgnoreCase: ignore case sensitivity
        String s4 = "java";
        String s5 = "Java";

        System.out.println(s4.equals(s5));  // false
        System.out.println(s4 == s5);  // false

        System.out.println(s4.equalsIgnoreCase(s5));  // true

        String s6 = "MuHtAr";
        String s7 = "muhtar";

        System.out.println( s6.equalsIgnoreCase(s7)); // true
        System.out.println(s6.equals(s7)); //false


        // isEmpty: checks if the length of string is 0
        String str = "  ";

        System.out.println(str.isEmpty()); // false

        str = str.trim(); //""

        System.out.println(str.isEmpty());  // true

        String str2 = "Cybertek"; // lenth != 0
        System.out.println( str2.isEmpty() ); // false

        str2 = ""; // length ==0
        System.out.println( str2.isEmpty() );




    }



}
