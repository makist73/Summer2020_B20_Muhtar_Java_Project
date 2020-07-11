package day23_Arrays;

public class FrequencyOfChars {

    public static void main(String[] args) {
        String str = "AAAAABBBBBBBBBBCCCCCCCCDDDDDDDDDDDEEEEEEEEEEEEE";
        String nonDup = "";  //"BCD"
            // ABCDE

        for(int i =0; i <= str.length()-1; i++){  // remove duplciates from str and added to nonDup
            String ch = ""+ str.charAt(i);   // B, B, C, C, D, D

            if(nonDup.contains(ch)){
                continue;
            }else{
                nonDup += ch;
            }

        }

         String expectedResult = "";    //"B2C2D2"

        // str = "BBCCDD"      nonDup = "BCD"    ===> "B2C2D2"

        for(int j=0; j <= nonDup.length()-1; j++){ // iterates the string nonDup

            char ch = nonDup.charAt(j);  // B, C, D   every single characters from nonDup
            int count = 0; // 2,  2,   2    frequnecy of every single ch

            for(int i=0; i <= str.length()-1; i++){  // returns the frequnecy of each ch from string str
                if(str.charAt(i) == ch){
                    count++;
                }
            }

            expectedResult += ""+ch + count;

        }


        System.out.println(expectedResult);


    }

}
