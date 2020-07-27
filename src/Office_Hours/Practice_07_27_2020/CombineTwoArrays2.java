package Office_Hours.Practice_07_27_2020;

import java.util.Arrays;

public class CombineTwoArrays2 {

    public static void main(String[] args) {
        char[] a1 = {'A', 'B', 'C'}; // i: 0, 1, 2
        char[] a2 = {'D', 'E', 'F', 'G', 'H', 'I', 'J'}; //J: 0, 1, 2, 3, 4, 5, 6

        char[] a3 = new char[ a1.length+a2.length ]; // j+a1.length: 0,1,2, 3,4,5,6,7,8,9


        for(int i = 0; i <= a1.length-1; i++){
            a3[i]  = a1[i];
        }

        for(int j = 0; j <= a2.length-1; j++ ){
            a3[j+a1.length] = a2[j];
        }

        /*
        int j = 0;
        while(j <= a2.length-1){

            a3[index] = a2[j];
            index++;
          j++  ;
        }
*/
        System.out.println(Arrays.toString(a3));



    }
}
