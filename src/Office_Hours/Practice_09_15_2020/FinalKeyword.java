package Office_Hours.Practice_09_15_2020;

public class FinalKeyword {

    private final int c = 200;  // cannot be modified

    public int getC(){ // ready ONLY
        return c;
    }

    public void setC(int c){ // modify ONLY
   //     this.c = c;
    }

    /*
    5 private variables:
            3 of them are final
            2 of them are not final

    how many getter:   5
    how many setter:   2

     */

 //   final static int z = 300;
    final private String userName = "cybertek";
    final private String passWord = "Cybertek123";

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }


    public static void main(String[] args) {
       final int a = 100;
       //a = 200;
    }


}


class TestBase{

    // @beforeMethods
    public final void setUp(){
        System.out.println("Set Up the driver");
        System.out.println("Open Browser");
        System.out.println("URL");
        System.out.println("Maximize window");
        System.out.println("Implicit wait");
    }

    //@afterMethod
    public final void tearDown(){
        System.out.println("if failed, take screenshot");
        System.out.println("Close Browser");
    }

}


class TestCase extends TestBase{

    //@Test ==> run as TestNg
      //  public void setUp(){ }  // final method cannot be override

}


final class Tester{
    // name, age, gender,....jobTi,   findBug().....

}

// class BA extends Tester{ }  // final class cannot be super, can only be sub