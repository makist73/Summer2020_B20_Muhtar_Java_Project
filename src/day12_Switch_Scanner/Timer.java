package day12_Switch_Scanner;

import Library.Util;

import java.util.Scanner;

public class Timer {

    public static void main(String[] args)  {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter the number of minutes");
        int minutes=scan.nextInt();
        for (int i=minutes; i > 0 ;--i) {
            if( i< 0 )
                break;
            for (int z=59; z >=0 ; --z) {
                System.out.println((i-1)+" minutes and "+z+" seconds left");
                Util.sleep(1);
            }
        }

        System.out.println(" \n \t \t********************************************* ");
        System.out.println("  \t \t***                                       *** ");
        System.out.println("   \t \t***  Times is Up, Please take your seats! *** ");
        System.out.println("    \t \t***                                       *** ");
        System.out.println("     \t \t********************************************* ");
    }

}
