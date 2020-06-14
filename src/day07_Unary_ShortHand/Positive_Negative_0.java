package day07_Unary_ShortHand;

public class Positive_Negative_0 {

    public static void main(String[] args) {
        double num = 0;

        boolean positive = num > 0;
        boolean negative = num < 0;
        boolean zero =   num == 0;

        System.out.println(num +" is positive? "+positive );
        System.out.println(num +" is negative? "+negative);
        System.out.println(num + " is Zero? " + zero);



    }

}
