package day55_Abstraction.ShapesTask;
/*
1. create an abstract class called Shape
			attributes:
				name(static), area, perimeter, hasVolume(static), volume
			abstract methods: calculateArea(), calculatePerimeter(), calculateVolume()
								return-types: double
 */

public abstract class Shape { //cannot create object, cannot be final

    public String name;
    public boolean hasVolume;
    public double area;
    public double perimeter;
    public double volume;

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public abstract double calculateVolume();


}
