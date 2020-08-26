package Office_Hours.Practice_08_26_2020;

public class Practice2 {


    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6};
        printArray(arr1);

        int[] arr2 = {9,8,7,6,5,4};
        printArray(arr2);

        int[] arr3 = {100, 200, 300};
        printArray(arr3);


    }


    public static void printArray(int[] arr){
        for(int each : arr ){
            System.out.print(each+" ");
        }
        System.out.println();
    }



}
