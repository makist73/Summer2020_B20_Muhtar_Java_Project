package day62_Maps;

public class Test {

    public static void main(String[] args) {

      //  String favoriteColor = "Pink";

        Color favoriteColor = Color.White;

        System.out.println(favoriteColor);

       // String browserName = "java";

      //  Browser browserName = Browser.opera;


        Browser browserName = Browser.chrome;

        switch (browserName){

            case chrome:
                System.out.println("Chrome browser is set");
                break;

            case firefox:
                System.out.println("Firefox browser is set");
                break;

            case safari:
                System.out.println("Safari browser is set");
                break;

            case edge:
                System.out.println("Edge browser is set");
                break;

        }

        System.out.println("=========================================");

       Day day = Day.Mon;
       Day day2 = Day.Tue;
       Day day3 = Day.Thu;

       Month month1 = Month.Jan;

       Level level1 = Level.Low;
       Level level2 = Level.Medium;
       Level level3 = Level.High;
       Level level4 = Level.ChuckNorries;
     //  Level level5 = Level.Khabib;





    }

}
