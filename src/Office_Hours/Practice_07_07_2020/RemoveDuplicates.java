package Office_Hours.Practice_07_07_2020;

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();   // "nal"

            String result = ""; //"nal"

            for(int i = 0;  i <= str.length()-1; i++ ){

                   String s =""+ str.charAt(i);  //s: n, a, l, a, n
            /*
                if(result.contains(s)){
                    continue;
                }else{
                    result += s;
                }
             */

                if(!result.contains(s)){
                    result += s;
                }

            }

        System.out.println(result);


    }

}
