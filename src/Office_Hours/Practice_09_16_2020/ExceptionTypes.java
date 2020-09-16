package Office_Hours.Practice_09_16_2020;
import java.lang.Exception;

public class ExceptionTypes {

    public static void main(String[] args) {

     //   System.out.println("Cybertek".charAt(200)); // unchecked ==> unexpected

    //    Thread.sleep(3000); // checked ==> unwanted, MUSt be handled immedietly

    try {
        System.out.println(9 / 0);
    }catch (RuntimeException e){
        System.out.println("Exception is caught: " +e.getMessage());
    }


  try {
        Thread.sleep(3000);
    }catch (InterruptedException e){
        System.out.println("catch block handled it");
    }



        System.out.println("Test Case 1 Completed");

    }
}
