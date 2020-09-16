package Office_Hours.Practice_09_16_2020;

public class ThrowKeyword {
    public static void main(String[] args) {
        String browser = "cybertek";

        if(!browser.equals("chrome")){
            throw new RuntimeException("there is no such a browser named: "+browser);
        }

        System.out.println("Test started on: "+browser+" browser");

    }

    public void method1() throws ClassNotFoundException{
        throw new ClassNotFoundException();
    }

    public void method2() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }

    public void method3()throws ClassNotFoundException, CloneNotSupportedException{
        method1();
        method2();
    }


}
