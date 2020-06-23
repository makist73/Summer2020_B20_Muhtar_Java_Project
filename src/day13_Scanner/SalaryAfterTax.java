package day13_Scanner;
/*
1. write a program that can calculate the state tax, federal tax and salary after tax
                needed information:
                                annual salaray
                                state tax rate
                                federal tax rate
 */

import java.util.Scanner;

public class SalaryAfterTax {

    public static void main(String[] args) {

        Scanner  input = new Scanner(System.in);
        System.out.println("Enter your annual salary: ");
        int salary  =    input.nextInt();  // 100000

        System.out.println("Enter your state tax rate: ");
         double stateTaxRate =  input.nextDouble(); // 0.08
         double stateTax = salary * stateTaxRate;

        System.out.println("Enter your federal tax rate: ");
        double federalTaxRate =   input.nextDouble(); // 0.2
        double federalTax = salary * federalTaxRate;

        double salaryAfterTax = salary - (stateTax + federalTax);

        System.out.println("Your annual salary: $ "+salary );
        System.out.println("Your state tax: $ " +stateTax);
        System.out.println("Federal tax : $ " +federalTax);
        System.out.println("your salary after tax: $ " + salaryAfterTax);





    }

}
