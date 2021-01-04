package bootCamp;

public class LoopPractice {
    public static void main(String[] args) {

        for(int i = 25 ;  i < 30  ;  i++  ){
            System.out.println("Slack is down");
        }

        System.out.println("====================================");
        int j = 25;
        while( j > 20 ){
            System.out.println("Slack is down");
            j--;
        }

        System.out.println("===================================");
/*
3 data Structures:
    Array
    Collection
    Map
 */

        int[] numbers = {10, 20, 30, 40};

        for(int each : numbers ){
            System.out.println(each);
        }

        System.out.println("===========================");

        for(int i = 0; i < numbers.length; i++){
            System.out.println(i);
        }





    }
}
