package day12_Switch_Scanner;

public class Switch_Practice2 {

    public static void main(String[] args) {

        String productName = "MacBook";

        switch(productName){

            case "galaxy":
                System.out.println("Samsung");
                break;

            case "iphone":
            case "ipad":
            case "MacBook":
                System.out.println("Apple");
                break;

        }



    }

}
