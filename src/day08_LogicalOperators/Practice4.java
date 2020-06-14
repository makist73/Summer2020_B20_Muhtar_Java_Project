package day08_LogicalOperators;
/*
Create a double variable with the value 20
Create a second variable of type double with the value 80
Add both numbers up and multiply by 25
Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
Print remaining total (#4)  is equal to 20 or less : true/false
 */

public class Practice4 {
    public static void main(String[] args) {
        double num1 = 20;
        double num2 = 80;
        double result = (num1 + num2) * 25;  // 2500
        double remainder = result % 40;

        boolean r = remainder <= 20;

        System.out.println(r);

    }
}
