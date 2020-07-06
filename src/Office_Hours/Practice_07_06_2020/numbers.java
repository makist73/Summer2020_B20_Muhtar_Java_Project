package Office_Hours.Practice_07_06_2020;

/*
1. write a program that can print the numbers between 1 to 100.
                if the number is divivible by 3, do not print it
 */

public class numbers {

    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++ ){

            if(i % 3 == 0){
                continue;
            }
                System.out.print(i + " ");


        }


    }

}
