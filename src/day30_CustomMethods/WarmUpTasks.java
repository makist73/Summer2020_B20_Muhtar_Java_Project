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

public class WarmUpTasks {

    public static void main(String[] args) {

        maxNum(123, 123);

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






}
