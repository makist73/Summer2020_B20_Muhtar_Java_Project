package Office_Hours.Practice_09_09_2020;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone  iphone = new Iphone("11 Pro", 1000);

        iphone.call(911);
        iphone.text(123456);

        System.out.println(iphone);

        System.out.println("===========================");

    }

}
