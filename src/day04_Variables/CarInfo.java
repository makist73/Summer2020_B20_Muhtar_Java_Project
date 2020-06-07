package day04_Variables;
/*
Task:
    create a class called CarInfo:
            Year
            Brand
            Model
            Mileage
            Price

            print the info of the car

            Ex:
                2020
                BMW
                X5
                30000
                45000

            output:
                2020 BMW X5, 3000 miles, $45000
 */

public class CarInfo {
    public static void main(String[] args) {
        int year = 2019;
        String brand = "Honda";
        String model = "Civic";
        int mileage = 60000;
        double price = 35000.50;
        String color = "Black";

        // 2018 Toyota Corolla Red, 50000 miles, $25000.5
    System.out.println(year+" "+brand+" " + model+" "+color+", "+mileage +" miles, $"+price);


    }

}
