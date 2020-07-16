package day27_recap;

public class ForEachLoop {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};
        //            0  1  2  3  4

        for(int i = 0; i <= arr.length-1; i++){
            System.out.print(arr[i] +" " );
        }

        System.out.println();
        System.out.println("============================");

        for(int each  : arr){
            System.out.print(each+" ");
        }

        System.out.println();
        System.out.println("=================================");

        for(int i = arr.length-1; i >=0; i--){
            System.out.print(arr[i] +" " );
        }

        System.out.println();
        System.out.println("=================================");




    }


}
