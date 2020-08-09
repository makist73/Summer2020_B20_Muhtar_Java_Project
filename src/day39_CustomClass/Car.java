package day39_CustomClass;

public class Car {
    /*
        Attributes:
            model, brand, year, color, mileage, price
     */


    String brand;
    String model;
    int year;
    String color;
    double mileage;
    double price;

    public void setCarInfo(String carBrand, String carModel, int carYear, String carColor, double carMileage, double carPrice){
        brand = carBrand;
        model = carModel;
        year = carYear;
        color = carColor;
        mileage = carMileage;
        price = carPrice;
    }
    // sets the info of the car objects


    // 2012 Toyota Corolla, Red, 10000, $45000
    public void getCarInfo(){
        System.out.println(year +" "+brand+" "+model+", "+ color+", "+mileage+", $"+price);
    }
    // prints the car info

    public void start(){
        System.out.println(brand+" "+model+" is started");
    }



    /*
    car1: Toyota
    car2: BMW
    car3: Tesla
     */

}
