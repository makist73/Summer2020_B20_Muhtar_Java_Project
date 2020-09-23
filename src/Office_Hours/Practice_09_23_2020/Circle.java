package Office_Hours.Practice_09_23_2020;

public class Circle extends Shape {
    // area, perimeter, volume
    public double radius;

    public Circle(double radius){
        if(radius <= 0){
            throw new RuntimeException("Circle' radius cannot be negative or zero");
        }
        this.radius = radius;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    @Override
    public double calculateArea() {
        return Math.pow(radius, 2) * Math.PI;  // r * r * PI
    }

    @Override
    public double calculatePerimeter() {
        return radius * 2 * Math.PI;
    }


}
