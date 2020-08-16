package day42_Static;

public class Car {
    String brand;
    String model;
    int year;
    String VIN;
    String color;
    double price;

    static boolean hasWheel = true ;
    static int numberOfTires = 4;
    static boolean hasEngine = true;
    static boolean hasDoors = true;
    static boolean hasAirBag = true;
    static boolean hasSeatBelt = true;
    static boolean hasHorn = true;


    public void start(){
        System.out.println("Starting "+brand+" "+model);
    }

    public static void printTires(){
        System.out.println(numberOfTires+" Tires");
    }

    public String toString(){
        return "Brand: "+brand+", Model: "+model+", Year: "+year+", Color: "+color
                +"\nNumber of tires: "+numberOfTires+"\nHas Engine: "+hasEngine
                +"\nHas Wheel: "+hasWheel+"\nHas Airbags: "+hasAirBag;
    }



    /*
    car1:
    car2:
    car3:
    car4:
     */
}
