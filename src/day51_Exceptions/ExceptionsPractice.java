package day51_Exceptions;

import Library.Util;

public class ExceptionsPractice {

    public static void main(String[] args) {

        System.out.println("Hello");

/*
    try {
        Thread.sleep(5000);
    }catch (InterruptedException e){

    }
*/
            sleep(3);

        System.out.println("World");

        /*
    try {
        Thread.sleep(3000);
    }catch (InterruptedException e){

    }
*/

        sleep(5);

        System.out.println("How are you?");


        Util.sleep(10);

        System.out.println("Good Bye");


    }


    public static void sleep(double seconds){
        try {
            Thread.sleep((long)(seconds * 1000));
        }catch (InterruptedException e){

        }
    }




}
