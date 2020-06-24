package day13_Scanner;

import java.util.Scanner;

public class nextline_VS_nextMethods {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble(); //100000

        scan.nextLine(); // Enter
        // use use this to take out the Enters tht are left in the scanner. so that we can use the next netxline method


        System.out.println("Enter your full name: ");
        String fullName =  scan.nextLine();

        System.out.println("Salary: "+salary);
        System.out.println("full name: "+fullName);


    }


}
