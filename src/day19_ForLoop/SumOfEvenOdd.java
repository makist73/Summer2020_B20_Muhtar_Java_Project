package day19_ForLoop;
/*
    3. write a program that can calculate the sum of all the even numbers between 0 ~ 100
    4. write a program that can calculate the sum of all the odd numbers between 0 ~ 100

 */
public class SumOfEvenOdd {

    public static void main(String[] args) {
        // Taks:03:
        // 0 2 4 6 8 10 ...

        int sumOfEven = 0;


        /*
        sum+= 2;
        sum += 4;
        ...
         */

/*
        for(int i = 0; i <= 100; i += 2 ){
           sumOfEven += i; // sum of all even numbers
        }
  */

        for(int i = 0; i <= 10000; i++){
            if(i % 2== 0 ) {
                sumOfEven += i;
            }
        }

        System.out.println(sumOfEven);

        System.out.println("=======================================================");
        // task04:
        // 1 3 5 7 9 .... 99

        int sumOfOdd = 0;

        /*
        for(int i = 1; i <= 99; i += 2 ){
            sumOfOdd +=i ; // sumOfOdd = sumOfOdd +i ;
        }
        */

        for(int i = 0; i <= 100; i++){
            if(i%2 != 0){
               // sumOfOdd = sumOfOdd + i;
                sumOfOdd += i;
            }
        }

        System.out.println(sumOfOdd);



    }


}
