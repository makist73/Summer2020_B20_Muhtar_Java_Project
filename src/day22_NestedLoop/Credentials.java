package day22_NestedLoop;

import java.util.Scanner;

public class Credentials {
    /*
    username: cyber
    password: tek123
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your user name");
        String u = scan.next();

        System.out.println("Enter your password");
        String p = scan.next();

        int attempt = 1;

        while(  !(u.equals("cyber") && p.equals("tek123"))  ){

            if(attempt > 2){
                System.out.println("Your account is locked");
                System.exit(0);
            }

            System.out.println("Invalid user name or password, Please re-enter");
            System.out.println("Enter your user name");
            u = scan.next();

            System.out.println("Enter your password");
            p = scan.next();

            attempt++;
        }


        System.out.println("Logged in");



    }



}
