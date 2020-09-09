package day52_Exceptions;

public class ThrowsKeyword {


    public static void main(String[] args) throws InterruptedException {

        method1(); // exception was handled temporary by throws

        method2(); // exception was permanently handled by try&catch

        method3();

        Thread.sleep(4000);

        Thread.sleep(3000);

        Thread.sleep(5000);

    }



    public static void method1() throws InterruptedException{ // not permanent
        Thread.sleep(3000);
    }

    public static void method2(){
        try {  // permanent solution
            Thread.sleep(3000);
        }catch (InterruptedException e){

        }
    }


    public static void method3() throws InterruptedException{
        method1();
    }




}
