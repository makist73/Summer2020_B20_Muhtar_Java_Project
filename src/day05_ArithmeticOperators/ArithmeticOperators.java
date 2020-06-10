package day05_ArithmeticOperators;

public class ArithmeticOperators {

    public static void main(String[] args) {
        System.out.println( 20 + 3 - 2 +1 );
                        //  23 - 2 + 1
                        //  21  + 1
                        // 22

        System.out.println( 20 * 3 );

        System.out.println( 2 + 3 - 1 * 4 );
                    //      2 + 3 -  4
                    //      5 - 4
                    //       1

        System.out.println( 10/3 );  // int/int ==> int
        System.out.println( 10.0/3 );  // double/int ==>double

        System.out.println( 10 / 3.0  ); // int/double ==> double

        System.out.println( 10.0 / 3.0 ); // double/double ==> double

        System.out.println(10/4.0 );
        System.out.println( 10 % 4);
        //             10 / 4  = 2
        //            10 - (4*2) = 2

        System.out.println( 30 % 8);
            //     30 / 8  = 3
            // remainder: 30 - ( 8 * 3 )
          //              30 - 24 = 6

        System.out.println( 99 % 4);
        //           99/4 = 24
        //          99 - (4*24)
        //          99 - 96 = 3

    }

}
