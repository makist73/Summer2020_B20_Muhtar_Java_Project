package day33_LocalDateTime;

import java.time.LocalDate;
import java.util.Scanner;

public class Dates {

    public static void main(String[] args) {

        LocalDate  DOB = LocalDate.of(2020,7, 24);
        // year-month-days

        System.out.println(DOB);

        LocalDate today = LocalDate.now();

        System.out.println(today);

        LocalDate y = LocalDate.of(2019,1,1);
        boolean result = y.isLeapYear();
        System.out.println(result);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = scan.nextInt();

        boolean result2 = LocalDate.of(year, 1,1).isLeapYear();

        System.out.println(result2);
        System.out.println("==========================");
        System.out.println("Enter birth year, birth month, bith day");

         LocalDate d = LocalDate.of(scan.nextInt() , scan.nextInt(), scan.nextInt() );

        System.out.println(d);
        System.out.println( d.isLeapYear() );



    }

}
