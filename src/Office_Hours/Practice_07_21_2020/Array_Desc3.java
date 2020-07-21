package Office_Hours.Practice_07_21_2020;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Desc3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers you want to enter?");
        int size = scan.nextInt(); // 5

        int[] arr = new int[size];

        for(int i = 0; i <= size-1; i++ ){
            System.out.println("Enter a number");
             arr[i]  = scan.nextInt();

        }

        System.out.println(Arrays.toString(arr)); // [10, 20, 5, 40, 15]

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int[] descArr = new int[size]; // will contain the descending order to original array

        int k= arr.length-1;
        for( int each: arr){
            descArr[k] = each;
            k--;
        }

        System.out.println(Arrays.toString(descArr));

    }

}
