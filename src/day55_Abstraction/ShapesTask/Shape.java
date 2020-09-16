package day55_Abstraction.ShapesTask;
/*
1. create an abstract class called Shape
			attributes:
				name(static), area, perimeter, hasVolume(static), volume
			abstract methods: calculateArea(), calculatePerimeter(), calculateVolume()
								return-types: double
 */

public abstract class Shape { //cannot create object, cannot be final

    public static String name;
    public double area;
    public double perimeter;
    public static boolean hasVolume;
    public double volume;

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public abstract double calculateVolume();


}
