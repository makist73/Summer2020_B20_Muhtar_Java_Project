package day07_Unary_ShortHand;
/*
1. create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
 */

public class LeapYear {

    public static void main(String[] args) {

        int year = 2040;
          boolean result =  year % 4 == 0;

        System.out.println("Year " + year + " is a leap year: " + result); // 2021 is a leap year: false

    }

}
