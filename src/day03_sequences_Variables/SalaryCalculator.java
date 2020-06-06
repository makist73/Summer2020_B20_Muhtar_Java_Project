package day03_sequences_Variables;
/*
task:               100000,  0.28
        variables: salary, tax

                totalTax = salary * tax;
               salaryAfterTax =   salary - totalTax

               100000 ,     0.28;
                100000 * 0.28 = 28000;
                100000 - 28000 = 72000;
 */
public class SalaryCalculator {

    public static void main(String[] args) {
        double salary = 150000.0;
        double tax = 0.28;

        double totalTax =   salary * tax;  // 28000
        double salaryAfterTax = salary - totalTax;  //72000

        System.out.println(salaryAfterTax);

    }


}
