package day08_LogicalOperators;
/*
1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
 */

public class GallonsToLitters {

    public static void main(String[] args) {
        double gallons = 20;
        double litters = gallons * 3.785;

        System.out.println(gallons+" gallons equal to " + litters + " litters");


    }


}
