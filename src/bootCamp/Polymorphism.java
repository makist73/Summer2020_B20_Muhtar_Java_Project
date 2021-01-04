package bootCamp;

public class Polymorphism {

    public static void main(String[] args) {

       Shape shape1 = (Shape) (new Rectangle());  // up casting

       // WebDriver driver = (WebDriver)(new ChromeDriver());
        // TakeScreenShot ts =(TakeScreenShot)  (new ChromeDriver());

       // Rectangle rectangle = (Rectangle)shape1;  // down casting
       double length =  ( (Rectangle)shape1 ).length;  // down casting

        /*
        WebDriver driver = new ChromeDriver();
        ( (TakeScreenShot)driver ).takeScreenShot()

        ( (JavaScriptExecuter)driver).executeScript()

         */


        Shape shape2 = new Cube();

       // System.out.println(shape2.length);

      //  Rectangle r1 = (Rectangle)shape2;

     //   System.out.println(r1.length);

        /*
        WebDriver driver = new ChromeDriver();


        FireFoxDriver firefox = (FireFoxDriver)driver;
         */


        Shape shape3 = new Circle();


        System.out.println( shape3 instanceof Rectangle);

        /*
        boolean isChrome = driver instanceof ChromeDriver;
         */





    }

}
