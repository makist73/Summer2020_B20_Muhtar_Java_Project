package day25_Practices;

import java.util.Arrays;

public class Array_1_100 {

    public static void main(String[] args) {
      int[] numbers = new int[100];
      /*
       numbers[0]  = 1;
       numbers[1]  = 2 ;
       numbers[2]  = 3;
       numbers[3]  = 4;
       ....
       */

        for(int i = 0; i <= numbers.length-1; i++){
            numbers[i] = i+1;
        }


        System.out.println(Arrays.toString(numbers));

        for(int each  : numbers ){

            if(each%2 != 0){
                continue;
            }

            System.out.print(each+" ");
        }


    }

}
