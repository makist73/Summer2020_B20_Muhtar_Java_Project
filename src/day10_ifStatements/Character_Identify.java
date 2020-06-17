package day10_ifStatements;

public class Character_Identify {

    public static void main(String[] args) {
        char character = 'A';
        //                        65 <= character <= 90             ||   97 <= character <= 122
        boolean isAlphabetic = (character >= 65 && character <= 90) || (character >= 97 && character <= 122);
                    //           upper case letters     ||  lower Case letter
                // 48 <= CHARACTER <= 57
        boolean isDigit = character >= 48  && character <= 57;

        String alphabet = "";

        if(isAlphabetic == true) {
        //    System.out.println(character + " is Alphabetic character");
            alphabet = character + " is Alphabetic character";

        }else {
         //   System.out.println(character + " is not Alphabetic character");
            alphabet = character + " is not Alphabetic character";
        }

        System.out.println(alphabet);

        String digit = "";

        if(isDigit == true ){
            digit = character+" is a digit";
        }else{
            digit =  character+" is not a digit";
        }

        System.out.println(digit);



    }

}
