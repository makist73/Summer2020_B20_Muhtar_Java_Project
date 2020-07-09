package day22_NestedLoop;

/*

 *
 **
 ***
 ****
 *****
 ******
 *******


 *******
 ******
 *****
 ****
 ***
 **
 *
 */

public class Nested_Loop4 {

    public static void main(String[] args) {

        for(int j = 1; j <= 7; j++){ // j:  1, 2, 3, 4, 5, 6, 7

            for(int k = 1; k <= j; k++){ //k: 1, 2, 3, 4, 5, 6, 7
                System.out.print("*");
            }
            System.out.println();

        }

        System.out.println("======================================================");


        for(int j =7; j>= 1;j--){ // j: 7 6 5 4 3 2 1

            for(int k= j; k>= 1; k-- ){  // k: 7  6 5 4 3 2 1
                System.out.print("*");
            }
            System.out.println();

        }



    }


}
