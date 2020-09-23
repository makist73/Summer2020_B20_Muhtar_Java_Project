package day57_Polymorphism;

interface AndroidApps{
    String AppStoreName = "Market Play";
    String OS = "Android";
    void downloadAndroidApp();
}

interface AppleApps{
    String AppStoreName = "Apple Store";
    String OS = "IOS";
    void downloadAppleApp();
}

abstract class Phone{
    public String brand, model, size;
    public double price;

    public Phone(String brand, String model, String size, double price) {
        if (price <= 0){
            throw new RuntimeException("Invalid Price, Price cannot be negative or 0");
        }
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
    }

   public abstract void call();

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}

class Iphone extends Phone implements AppleApps{

    public Iphone(String model, String size, double price) {
        super("Apple", model, size, price);
    }

    @Override
    public void downloadAppleApp() {
        System.out.println("Downloading apple apps from "+AppStoreName);
    }

    @Override
    public void call() {
        System.out.println("Iphone is calling");
    }
}

class Samsung extends Phone implements AndroidApps{

    public Samsung( String model, String size, double price) {
        super("Samsung", model, size, price);
    }

    @Override
    public void downloadAndroidApp() {
        System.out.println("Downloading apple apps from "+AppStoreName);
    }

    @Override
    public void call() {
        System.out.println("Samsung is calling");
    }
}

public class PhoneObjects {

    public static void main(String[] args) {
        Samsung sm =new Samsung("S12", "10 inches", 1200);
        sm.call();
        System.out.println(sm);

        Iphone iphone = new Iphone("12", "12 inches", 1500);
        iphone.call();
        System.out.println(iphone);
    }

}
