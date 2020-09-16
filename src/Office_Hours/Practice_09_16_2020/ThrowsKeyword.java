package Office_Hours.Practice_09_16_2020;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException{

        ThrowsKeyword obj = new ThrowsKeyword();

           obj.methodA();

        obj.methodA();

        obj.methodA();

    }

    public void methodA() throws InterruptedException{ // declared that method throws an exception
        Thread.sleep(3000);
    }

    public void methodB() throws InterruptedException{
        methodA();
    }


}
