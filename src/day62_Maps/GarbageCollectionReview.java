package day62_Maps;


import day55_Abstraction.ShapesTask.Circle;
import day55_Abstraction.ShapesTask.Rectangle;

public class GarbageCollectionReview {

    public static void main(String[] args) {
        String str1 = "Cybertek"; // GC
        str1 = null;

        System.out.println(str1);


        String s1 = new String("John");
        String s2 = new String("Aaron");

        s1 = s2;   // "John" is eligible for Garbage collection
        System.out.println(s1 +" : "+s2);

        System.out.println("============================================");

        Circle c1 = new Circle(3);
        c1 = null;

        System.out.println(c1);

        Rectangle r1 = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle(2,5);

       r1 = r2;  // 10, 20  will be eligible for GC

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("=========================================");

        String a1 = "Cybertek";
        a1 = null;  // "Cybertek" is eligible for garbage collection

        System.out.println(a1);

        String a2 = "MIT";
        String a3 = "Harvard";
        a2 = a3;  // "MIT" is eligible for garbage collection

        System.out.println(a2);
        System.out.println(a3);

        System.out.println("==========================================");

        /*
        driver.close();
        driver = null;
         */


    }

}
