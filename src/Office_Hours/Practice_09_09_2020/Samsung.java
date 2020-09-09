package Office_Hours.Practice_09_09_2020;

public class Samsung extends Phone {

    /*
        variables: 4
        methods: 3
     */

    public Samsung(String model, double price){
        super(model, price);
    }

    @Override
    protected void call(long phoneNumber) {
        System.out.println("Samsung "+model+" is calling: "+phoneNumber);
    }

    @Override
    protected void text(long phoneNumber) {
        System.out.println("Samsung "+model+" is texting: "+phoneNumber);
    }

    static{
        brand = "Samsung";
        madeIn = "Korea";
    }




}
