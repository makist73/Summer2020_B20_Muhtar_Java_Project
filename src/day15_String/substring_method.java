package day15_String;

public class substring_method {

    public static void main(String[] args) {

        String sentence = "Java is fun";
        //                 0123456789..

        // substring(beg index, end index):
        String word1 = sentence.substring(0 , 4);
        System.out.println(word1);

        String word2 = sentence.substring(8, 11);
        System.out.println(word2);

        System.out.println("==============================");

        String sentence2 = "I like Movies and TV Series";
        //                  0123456789....

        String word3 = sentence2.substring(7,12+1);

        System.out.println(word3);


        System.out.println("==================================");
        String firstName = "cRISTINa";
        String firstCharacter = firstName.substring(0,1);
        String rest = firstName.substring(1, firstName.length() ); // firstName.length(): lastIndex + 1

        firstName = firstCharacter.toUpperCase() + rest.toLowerCase();

        System.out.println(firstName);






    }

}
