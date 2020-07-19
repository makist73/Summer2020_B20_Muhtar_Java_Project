package day29_CustomMethods;

public class MethodsWithParameter {


    public static void main(String[] args) {

        printHello(5);

        System.out.println("=======================================");
        age(2000, 1990);

    }


    public static  void  printHello(int numberOfTimes){

        for(int i=0; i < numberOfTimes; i++){
            System.out.println("Hello World");
        }

    }


    public static void age(int birthYear , int currentYear){

        if(currentYear < birthYear){
            System.out.println("Invalid Entry");
        }else {
            int age = currentYear - birthYear;
            System.out.println("You are " + age + " years old");
        }

    }


}
