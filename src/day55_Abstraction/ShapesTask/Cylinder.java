package day55_Abstraction.ShapesTask;

public final class Cylinder extends Shape {

    public double radius;
    public double height;


    @Override
    public double calculateArea() {
        return  (2*Math.PI*radius*height)+(2*Math.PI*Math.pow(radius,2));

    }

    @Override
    public double calculatePerimeter() {
        return (2*Math.PI*height)+(4*Math.PI*Math.pow(radius,2));
    }

    @Override
    public double calculateVolume() {
        return Math.pow(radius,2)*height*Math.PI;
    }




}
