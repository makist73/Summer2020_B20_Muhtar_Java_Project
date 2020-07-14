package day25_Practices;

public class CountOddEven {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11};
        int countEven = 0;
        int countOdd = 0;

        for( int each : nums){
            /*
            if(each %2 ==0){
               countEven += 1;
           }else{
               countOdd++;
           }
             */

           if(each %2 ==0){
               countEven += 1;
               continue;
           }
           countOdd++;
        }

        System.out.println("Even Numbers: "+countEven);
        System.out.println("Odd Numbers: "+countOdd);





    }

}
