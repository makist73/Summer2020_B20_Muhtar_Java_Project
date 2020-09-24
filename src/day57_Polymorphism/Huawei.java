package day57_Polymorphism;

public class Huawei extends Phone implements  AndroidApp, AppleApp, Downloadable{


    public Huawei( String model, String size, double price) {
        super("Huawei", model, size, price);
        if(price > 200){
            throw new RuntimeException("No way Huawei is worth more than 200");
        }
    }

    @Override
    public void download() {
        System.out.println("Huawei is downloading apps from "+AndroidApp.AppStoreName+" and "+AppleApp.AppStoreName);
    }

    @Override
    public void texting(long phoneNumber) {

    }

    @Override
    public void calling(long phoneNumber) {

    }

    public void stealInfo(){

    }


}
