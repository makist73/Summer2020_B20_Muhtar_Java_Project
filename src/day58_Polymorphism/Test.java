package day58_Polymorphism;

abstract class Shapes{

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public abstract boolean equals(Shapes shape);

}

class Circles extends Shapes {
    public double r;

    public Circles(double radius){
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return r*r*3.14;
    }

    @Override
    public double calculatePerimeter() {
        return r * 2 * 3.14;
    }



    @Override
    public boolean equals(Shapes shape) {
        if(shape instanceof Circles){
            if(((Circles) shape).r == r){
                return true;
            }
        }
        return false;
    }
}

public class Test {

    public static void main(String[] args) {
        Circles c1 = new Circles(3);
        Circles c2 = new Circles(3);
        System.out.println(c1.equals(c2));

    }


}
