package day30_CustomMethods;
/*
wamrmup tasks:
	1. create a function that can print out the maximum number between two numbers
	2. create a function that can print out the array of integers in descending order
	3. create a function that can print out the combination of two integer arrays
	4.
		step1: create a function that can check if the given integer is positive, negative or zero
		step2: Use the above method to  write a program that can check every single elements of an array of Integers
		MUST use for each loop
 */

import java.util.Arrays;

public class WarmUpTasks {

    public static void main(String[] args) {

        maxNum(123, 123);

        int arr[]={5,2,3,4,5,6,4,7,0,-5,-54,-55,-5,54,-45,-45,-45 };
        printDesc(arr);



    }

    // task01:
    public static void maxNum(int a, int b){

        if(a == b){
            System.out.println("Equal");
            return;  // exits the method
        }

        if(a>=b ){
            System.out.println(a+" is maximum");
        }else{
            System.out.println(b+" is maximum");
        }
    }

    //Task02:
    public static void printDesc(int[] arr){  //{10,9,20,30,5,6,7};
        Arrays.sort(arr); // {5, 6, 7, 9, 10, 20, 30};

        for(int i=arr.length-1; i >= 0; i-- ){
            System.out.print(  arr[i]+" " );  // 30 20 10 9 7 6 5
        }

        System.out.println();
    }






}
