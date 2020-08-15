package day41_toString_Practice;

public class Car {

    String brand;
    String model;
    int year;
    double price;
    String color;

    public void setCarInfo(String brand, String model, int year, double price, String color){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color= color;
    }

    public String toString(){
        return year +" "+brand+" "+model+", "+color+", $"+price;
    }



}
