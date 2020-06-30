package Office_Hours.Practice_06_30_2020;

public class If_Practice {

    public static void main(String[] args) {
        int num = 400;

        String result = "";

        if( num % 2 == 0 ){
           // System.out.println(num+" is even number");
            result  = num+" is even number";
        } else {
           // System.out.println(num+" is odd number");
            result = num+" is odd number";
        }

        System.out.println(result);

        String result2 =  ( num % 2 == 0 ) ? num+" is even number" : num+" is odd number";
        System.out.println(result2);





    }

}
