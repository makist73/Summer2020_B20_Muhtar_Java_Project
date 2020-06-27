package day15_String;

public class String_Methods {
    public static void main(String[] args) {
        String name = "Cybertek School is a great place";
        //             01234567

        // charAt(index):
            char ch1 = name.charAt(0); //'C'
            char ch2 = name.charAt(5); //'t'
        System.out.println(ch1);
        System.out.println(ch2);

        // length() ==> int
         int l =   name.length();
        System.out.println(l);

        // last index: length of String - 1
        int lastIndexNumber = name.length() - 1;

        System.out.println( lastIndexNumber );

        char lastChar = name.charAt(lastIndexNumber);
        System.out.println(lastChar);

        //concat(Str): concatenation
            String schoolName = "Cybertek";

                schoolName = schoolName.concat(" School");   //"Cybertek School"

        System.out.println(schoolName);

        String r1 = "Cybertek" + 123 + 'A'+true;   //123
        System.out.println(r1);

        String r2 = "Cybertek".concat("123");


        // toLowerCase():
        String name1 = "CYBERTEK SCHOOL";
                 name1 = name1.toLowerCase();    // "cybertek school"

        System.out.println(name1);


        // toUpperCase():
        String name2 = "muhtar";
        name2 = name2.toUpperCase(); // "MUHTAR"

        System.out.println(name2);
        // (CAN WE HAVE MORE TASKS).tpLowerCase()


        // trim():
        String p = "     Cybertek       School    ";
              p =  p.trim();  // "Cybertek School"

        System.out.println(p);



    }

}
