package day14_Recap;

import java.util.Scanner;

/*
 1. write a program for the shipping info that, the program should ask:
                    building number ( nextInt() )
                            nextLine()
                    Street address (Assume it has more than one word) ( nextLine() )
                    city name (nextLine() )
                    state name ( next() )
                    zip code ( nextInt() )
                            nextLine()
                    full name of the person ( nextLine() )

            and prints the ship to info in the following format:

            ex output:
                    Ship To:  Jimmy joe
                              7925 Jones Branch Dr
                              MCLean, VA 22102
 */
public class Address {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your building number: ");
        int buildingNumber = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your street address: ");
        String streetAddress = scan.nextLine();

        System.out.println("Enter your city name: ");
        String cityName =  scan.nextLine();

        System.out.println("Enter your state: ");
        String stateName = scan.next();

        System.out.println("Enter your zipcode: ");
        int zipCode = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        scan.close();

        /*
        Ship To:  Jimmy joe
                  7925 Jones Branch Dr
                  MCLean, VA 22102
         */

        System.out.println("\nShip To: "+fullName+"\n"+buildingNumber+" "+streetAddress
                +"\n"+cityName+", "+stateName+" "+zipCode);


    }


}
