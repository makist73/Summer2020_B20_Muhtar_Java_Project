package day16_String;

public class String_Methods2 {


    public static void main(String[] args) {
        // isEmpty():
        String name1 = "Cybertek";
        System.out.println(  name1.isEmpty() );

        String name2 = "";
        System.out.println(name2.isEmpty());


        String str1 = "Java";  // String pool
        String str2 = new String("Java"); // heap

        System.out.println(str1+" : "+str2);
        System.out.println( str1 == str2 ); // false

        System.out.println( str1.equals(str2)  );

        String str3 = new String("Java");
        String str4 = new String("Java");

        System.out.println(str3 == str4); // false
        System.out.println( str3.equals(str4) );  // true

        String str5 = "Java";
        String str6 = "Java";

        System.out.println( str5 == str6 ); // true
        System.out.println(str5.equals(str6)) ;// true

        String str7 = "JAVA";
        String str8 = "java";

        System.out.println(str7.equals(str8) ); // FALSE
        System.out.println( str7.equalsIgnoreCase(str8) ); // true

        // YES, Yes, yes, yEs  ==> yes




    }

}
