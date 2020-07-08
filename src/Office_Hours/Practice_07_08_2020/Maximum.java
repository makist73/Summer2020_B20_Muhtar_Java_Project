package Office_Hours.Practice_07_08_2020;

import java.util.Scanner;

public class Maximum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = -2147483648;  // max = 400

        /*
        for(int i =1; i <= 5; i++){
            System.out.println("Enter a number");
            int n = scan.nextInt();

            if(n > max ){
                max = n;
            }

        }
         */

        int j = 1;
        while(j <= 5){

            System.out.println("Enter a number");
            int n = scan.nextInt();

            if(n > max ){
                max = n;
            }

            j++;
        }



        System.out.println("max: "+max);



    }

}
