package day08_LogicalOperators;
/*
3. A triangle is valid if the sum of three angles are equal to 180.
write a program that check whether a triangle is valid or not. if valid print valid,
 otherwise print invalid
 */

public class Triangle {

    public static void main(String[] args) {
        double angle1 = 200;
        double angle2 = 60;
        double angle3 = 20;

        boolean valid = angle1 + angle2 + angle3  == 180;
        boolean invalid = !valid;

        if(valid){
            System.out.println("Valid Triangle");
        }

        if(invalid){
            System.out.println("Invalid Triangle");
        }



    }

}
