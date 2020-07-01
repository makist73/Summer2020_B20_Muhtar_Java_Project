package day17_StringReview;

public class String_Methods {
    /*
    String methods: substring, replace, replaceFirst, indexOf,
    lastIndexOf, equals, equalsIgnorecase, isEmpty, ends, starts, contains
     */

    public static void main(String[] args) {
        // charAt(index); ==> char
        String str = "Cybertek";
        //            01234567

        char ch1 =  str.charAt(7);

        System.out.println(ch1);

        // +:
        String str2 = "Cybertek";
               str2 = str2+" " + "School";

        System.out.println(str2);

        // length() ==> int
        String str3 = "Cybertek School";
        //             01234567

        int l =  str3.length(); //15
        System.out.println("length: "+l);

        // last index: length -1

        char ch2 = str3.charAt(l-1); // str3.length()-1 ==? 15 - 1 ===> 14
        System.out.println(ch2);

        System.out.println("last index: "+ (l-1));


        // upperCase & lowerCase

        String str4 = "cybertek";
                str4 = str4.toUpperCase();  // "CYBERTEK"

        System.out.println(str4);

        String str5 = "JAVA";
             str5 =   str5.toLowerCase();  // "java"

        System.out.println(str5);

        //trim()
        String str6 = "     Cybertek School    ";
        System.out.println(str6);

           str6 = str6.trim(); // "Cybertek"
        System.out.println(str6);

        // substring:

        String str7 = "I Like Java Language";
        //             0123456789

        String word = str7.substring(7, 10+1); //"Java"
        System.out.println( str7 );
        System.out.println(word);

        String word2 = str7.substring(12, str7.length() );
        String word3 = str7.substring(12 );

        System.out.println(word2);
        System.out.println(word3);






    }

}
