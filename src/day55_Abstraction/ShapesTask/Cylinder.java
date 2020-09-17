package day55_Abstraction.ShapesTask;

import java.text.DecimalFormat;

public final class Cylinder extends Shape {

    public double radius;
    public double height;

    public Cylinder(double radius, double height) {
        if(radius<=0 || height<= 0){
            throw new RuntimeException("Radius and Height of Cylinder cannot be negative or 0");
        }

        this.radius = radius;
        this.height = height;
        area =  calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
        name = "Rectangle";
        hasVolume = false;
    }

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




    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                ", area=" + df.format(area) +
                ", perimeter=" + df.format(perimeter) +
                ", volume=" + df.format(volume) +
                '}';
    }


}
