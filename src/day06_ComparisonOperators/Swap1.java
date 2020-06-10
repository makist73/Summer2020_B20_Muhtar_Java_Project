package day06_ComparisonOperators;

public class Swap1 {

    public static void main(String[] args) {
        int a = 20;
        int b = 25;

        int c = b; // c = 25;

        b = a;    // b = 20
        a = c;   // a = 25

        System.out.println(a);  // 25
        System.out.println(b);  // 20

    }

}
