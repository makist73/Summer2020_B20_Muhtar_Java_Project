package day10_ifStatements;

public class If_WithoutCurlyBraces {
    public static void main(String[] args) {
        if(9 > 10){
            System.out.println("Hello");
            System.out.println("How are you");
        }

        System.out.println("======================");

        if(9 > 10) {
            System.out.println("Hello");
        }

            System.out.println("How are you");

        System.out.println("===============================");

        int num = 100;
        if(num%2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");




    }

}
