package day29_CustomMethods;

public class MaxMin {

    /*
    11. wirte a method that can print out the maximum number from any array of integers
	12. wirte a method that can print out the minimum number from any array of integers
     */

    public static void main(String[] args) {

        int[] numbers = {10, 9, 111, 20000, 10, 30, -100, -200};

        maxNum(numbers);
        minNum(numbers);

    }



    public static void maxNum(int[] arr){
        int max = arr[0];

        for( int each : arr ){
            if(each > max){
                max = each;
            }
        }

        System.out.println("Max: "+max);
    }


    public static void minNum(int[] arr){
        int min= arr[0];

        for( int each : arr ){
            if(each < min){
                min = each;
            }
        }

        System.out.println("Min: "+min);
    }



}
