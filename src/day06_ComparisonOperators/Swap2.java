package day06_ComparisonOperators;
//write a program that can swap two variables' values wihtout using temporary variable

public class Swap2 {

    public static void main(String[] args) {
        int a = 10;
        int b = 15;

       a = a + b ;  // a = 25;  b = 15
       b =  a - b;  // b = 10,  a= 25
       a =  a - b;  // a = 15, b = 10

        System.out.println(b);
        System.out.println(a);

    }

}
