package day16_String;

public class String_Methods {

    public static void main(String[] args) {

        // replace:
        String email = "cybertek@gmail.com";

       email = email.replace("gmail", "yahoo"); // "cybertek@yahoo.com"

        System.out.println(email);


        String word = "java";
         word =   word.replace("a", "e");  // "jeve"

        System.out.println(word);

        String sentence = "I like to lear Java, Java is cool, Java is fun";
        sentence = sentence.replace("a, Java" , "a, C#");

       sentence = sentence.replace("Java ", "Python ");

        System.out.println(sentence);

        String s1 = "I like to stay in Cybertek, Cybertek is nice place";  //MIT

       s1 = s1.replace("Cybertek", "MIT");

        System.out.println(s1);

        s1 = s1.replace("MIT", "Cybertek");

        System.out.println(s1);

        String s2 = "I like to leaRn Java, we aRe enjoying Java"; //r

        s2 = s2.replace("R", "r");  // "I like to learn Java"

        System.out.println(s2);




    }

}
