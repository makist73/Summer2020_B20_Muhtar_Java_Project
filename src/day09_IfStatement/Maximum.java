package day09_IfStatement;
/*
 1. write a java program that accepts three numbers and return the maximum number
                (assume that none of them are equal)
 */

public class Maximum {

    public static void main(String[] args) {
        double a = 500;
        double b = 200;
        double c = 1000;

        boolean aIsMax =   a > b   &&  a > c;
        //               500 > 200  &&  500 > 1000
        //                  true && false ==> false

        boolean bIsMax =  b > a && b > c;
               // aIsMax == false && b > c ;

        boolean cIsMax =  c > b && c > a  ;
                // aIsMax == false && bIsMax == false;
            // !aIsMax && !bIsMax  ==> !(aIsMax && bIsMax)

        double max = 0;  // we want to assign the maximum number to variable max

        if(aIsMax){
          //  System.out.println(a);
           max = a ;
        }

        if(bIsMax){
          //  System.out.println(b);
            max  = b;
        }

        if(cIsMax){
         //   System.out.println(c);
            max = c;
        }

        System.out.println(max +" is maximum number");



    }

}
