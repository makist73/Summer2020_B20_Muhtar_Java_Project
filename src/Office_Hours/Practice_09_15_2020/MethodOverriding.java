package Office_Hours.Practice_09_15_2020;

class X{
    protected void method1(int a){
        System.out.println("A");
    }
}

public class MethodOverriding extends X{

    @Override
   public void  method1(int a){
        System.out.println("B");
    }

}
