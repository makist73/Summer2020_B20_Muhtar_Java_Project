package Office_Hours.Practice_09_02_2020;

public class Circle {
    public double radius;
    public double diameter;
    public static double PI = 3.14;

    public double area;

    public Circle(double radius){
        this.radius = radius;
        diameter = radius * 2;
        area = calculateArea();
    }


    public double calculateArea(){
        return radius*radius*PI;
    }






}
