package day14_Recap;
/*
task:
1. gender (next() )
2. age (nextInt())
3. country name  ( nextLine() )
4. zipcode  ( nextInt()  )
5. full name (nextLine() )
6. full company name ( nextLine() )
 */

import java.util.Scanner;

public class Scanner_Practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Enter
        System.out.println("Enter your gender");
        String gender = input.next(); // female

        System.out.println("Enter your age: ");
        int age = input.nextInt(); // 19

        input.nextLine(); // Enter Enter

        System.out.println("Enter your country name: ");
        String countryName = input.nextLine();

        System.out.println("Enter your zipcode: ");
        int zipCode = input.nextInt(); //12345

        input.nextLine(); // Enter

        System.out.println("Enetr your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your company name");
        String companyName = input.nextLine();



    }


}
