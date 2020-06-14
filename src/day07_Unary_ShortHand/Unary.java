package day07_Unary_ShortHand;

public class Unary {
    public static void main(String[] args) {
        System.out.println( -1 + -10);
                       //    -1 - 10 ==> -11

        System.out.println(-11 -  -10 );
        //                 -11 + 10 =-1


    // --:
        int a = 20;
       // a = a - 1; // 19
         --a;
        System.out.println(a);

    // ++
        int b = 10;
       // b = b + 1;  // b = 11;
        ++b;
        System.out.println(b);

  //  pre:
        int x = 100;
        System.out.println( ++x ); // 101

        int y = 200;
        System.out.println( --y );  // 199

        int z = 80;
        System.out.println( ++z ); // z = 81
        System.out.println(--z); // 80


    }

}
