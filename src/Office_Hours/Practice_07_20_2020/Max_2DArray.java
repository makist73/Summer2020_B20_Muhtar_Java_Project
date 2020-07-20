package Office_Hours.Practice_07_20_2020;

public class Max_2DArray {
// write a program that can find the maximum number from any given two dimensional array

    public static void main(String[] args) {

        //                 0 1 2     0 1 2 3    0 1 2  3   4
        int[][] arr2D = { {1,2,3} , {4,5,6,7}, {8,9,10,11,12} , {13,14,15,20,16,17} };
    //                      0          1             2                  3
        int max = arr2D[0][0];


        for(int j = 0; j <= arr2D.length-1; j++ ){ // j: index numbers of arrays

            int[] eachArray =  arr2D[j];

            for(int i=0; i <= eachArray.length-1; i++){ // i: index numbers of elements
                int eachNum = eachArray[i];
                if(eachNum > max){
                    max = eachNum;
                }
            }

        }


/*
          int[] eachArray =  arr2D[0];
         for(int i=0; i <= eachArray.length-1; i++){
             int eachNum = eachArray[i];
             if(eachNum > max){
                 max = eachNum;
             }
         }

        int[] eachArray2 =  arr2D[1];
        for(int i=0; i <= eachArray2.length-1; i++){
            int eachNum = eachArray2[i];
            if(eachNum > max){
                max = eachNum;
            }
        }

        int[] eachArray3 =  arr2D[2];
        for(int i=0; i <= eachArray3.length-1; i++){
            int eachNum = eachArray3[i];
            if(eachNum > max){
                max = eachNum;
            }
        }
*/

        System.out.println("Maximum: "+max);


    }

}
