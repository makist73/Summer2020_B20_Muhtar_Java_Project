package day13_Scanner;

import java.util.Scanner;

public class Scanner_NextLine {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name: ");
          String fullName =  scan.nextLine();

        System.out.println("Enter your company name: ");
          String companyName =   scan.nextLine();

        System.out.println("Full Name: "+fullName);
        System.out.println("Company Name: "+companyName);

    }

}
