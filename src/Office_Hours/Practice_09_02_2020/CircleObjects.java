package Office_Hours.Practice_09_02_2020;
/*
	circle1:  r=3    d=6		PI=3.14
	circle2:  r=5    d=10		PI=3.14
	circle3:  r=6    d=12		PI=3.14
 */

public class CircleObjects {

    public static void main(String[] args) {
        Circle circle1 = new Circle(3);

        System.out.println("Circle1' radius: "+ circle1.radius ); //3.0
        System.out.println("Circle1' diameter: " + circle1.diameter ); //6.0

        System.out.println("Circle1' area: "+ circle1.calculateArea());
        System.out.println("Circle1' area: "+ circle1.area);



    }

}
