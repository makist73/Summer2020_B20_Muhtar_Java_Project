package day48_Inheritance.DeviceTask;
/*
1. create a class called Device
            attributes: brand, model, price, MadeIn, hasBattery, hasMemory, screenSize,
            methods: setInfo, toString
 */

public class Device {
        public String brand;
        public String model;
        public double price;
        public boolean hasBattery;
        public boolean hasMemory;
        public String screenSize;

        public static String madeIn;
        public static boolean isElectronic;

        static{
            madeIn = "China";
            isElectronic = true;
        }

        public void setInfo(String brand, String model, double price, boolean hasBattery, boolean hasMemory, String screenSize) {
                this.brand = brand;
                this.model = model;
                this.price = price;
                this.hasBattery = hasBattery;
                this.hasMemory = hasMemory;
                this.screenSize = screenSize;
        }



}
