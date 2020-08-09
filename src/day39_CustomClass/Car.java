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

    public void setInfo(String carBrand, String carModel, int carYear, String carColor, double carMileage, double carPrice){
        brand = carBrand;
        model = carModel;
        year = carYear;
        color = carColor;
        mileage = carMileage;
        price = carPrice;
    }



    /*
    car1: Toyota
    car2: BMW
    car3: Tesla
     */

}
