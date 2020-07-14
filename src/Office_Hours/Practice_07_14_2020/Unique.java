package Office_Hours.Practice_07_14_2020;

public class Unique {

    public static void main(String[] args) {

        String str = "ABABCDDEFFGHHIJJK";
         String expectedResult = "";  // "C"

        // str = "ABABC";

        for(int j = 0; j < str.length() ; j++){

            char ch = str.charAt(j); // A B A B C
            int count = 0 ; // frequency of ch

            for(int i = 0; i < str.length(); i++){  //helps us to calculate the frequency of ch and assign it to count
                char each =  str.charAt(i);
                if(each == ch){
                    count+=1;
                }
            }

            if(count == 1){ // unique
                expectedResult += ch;
            }

        }



        System.out.println(expectedResult);



    }


}
