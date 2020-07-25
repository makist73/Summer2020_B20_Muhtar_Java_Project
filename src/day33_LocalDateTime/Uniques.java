package day33_LocalDateTime;

public class Uniques {

    public static void main(String[] args) {
        int[] arr = {2,2,1,3,3, 4, 5, 6};

        for(int element : arr ){
            int count = 0 ;
            for(int b : arr){
                if(element == b){
                    count++;
                }
            }

            if(count == 1){
                System.out.print(element+" ");
            }
        }

        System.out.println();

/*
        int element =  arr[0]; //2
        int count = 0 ;
        for(int b : arr){
            if(element == b){
                count++;
            }
        }

        if(count == 1){
            System.out.println(element);
        }
*/

    }

    public static void uniqueElements(int[] arr){

        for(int element : arr ){
            int count = 0 ;
            for(int b : arr){
                if(element == b){
                    count++;
                }
            }

            if(count == 1){
                System.out.print(element+" ");
            }
        }

        System.out.println();

    }



}
