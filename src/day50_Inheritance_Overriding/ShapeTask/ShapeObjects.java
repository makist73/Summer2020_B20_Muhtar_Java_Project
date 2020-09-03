package day50_Inheritance_Overriding.ShapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle = new Circle(3);

        System.out.println( circle.calculateArea() );

        Rectangle rectangle = new Rectangle(3,4);

        System.out.println( rectangle.calculateArea() ); //12


        System.out.println( circle.calculatePerimeter() );

        System.out.println(rectangle.calculatePerimeter());









    }

}
