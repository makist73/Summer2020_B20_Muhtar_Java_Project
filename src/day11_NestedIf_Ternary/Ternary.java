package day11_NestedIf_Ternary;

public class Ternary {

    public static void main(String[] args) {
        int num = 100;
        String result = "";

        if(num % 2 == 0){
            result = "Even";
        }else{
            result = "Odd";
        }

        System.out.println(result);
        System.out.println("========================================");

       String result2 = (num % 2 == 0) ? "Even" : "Odd" ;

        System.out.println(result2);


        System.out.println("================================================");
        int num1 = 1000;
        int num2 = 20;

        int max1 = 0;

        if(num1 > num2){
            max1 = num1;
        }else{
            max1 = num2;
        }

        System.out.println(max1);

        int max2 =  (num1 > num2) ? num1 : num2;
        System.out.println(max2);

        System.out.println("=================================================");
        int age = 25;
        boolean eligible = false;

        if(age >= 21){
            eligible = true;
        }else{
            eligible = false;
        }

        System.out.println(eligible);
        // first task: convert the if statements above to ternary

        boolean eligible2 = (age >= 21) ? true : false ;
        System.out.println(eligible2);



        // second task: "can vote" or "Cannot vote"

        // third task: write a program that can check if two numbers are equal or not.



    }


}
