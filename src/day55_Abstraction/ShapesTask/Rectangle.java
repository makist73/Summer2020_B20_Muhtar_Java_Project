package day55_Abstraction.ShapesTask;
/*
3. create a sub class of shape called Rectangle
			attributes: width, length, name(static), area, perimeter, hasVolume(static), volume

			override the abstract methods

			add a constructor that takes two arguments for W & L of rectangle the and initialize the instance variables: width, length, area, perimeter, volume

			add a static block that can initialize the static variables of the rectangle
 */

public class Rectangle extends Shape {

    public double width;
    public double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
    }

    @Override
    public double calculateArea() {
        return width*length;
    }

    @Override
    public double calculatePerimeter() {
        return (width+length)*2;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }

    static{
        name = "Rectangle";
        hasVolume = false;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }

}
