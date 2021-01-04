package bootCamp;

interface Volume {
    int a = 100;  // public static final
    double volume();
}

abstract class  Shape{

    public String name;

    protected abstract double area();

}

final class Rectangle extends Shape{

    public double length, width;

    @Override
    public double area(){
        return length * width;
    }


}

final class Circle extends Shape{
    public double r;

    @Override
    protected double area(){
        return r * r * 3.14;
    }



}

final class Cube extends Shape implements Volume{

    @Override
    protected double area() {
        return 0;
    }


    @Override
    public double volume() {
        return 0;
    }
}



public class Inheritance {
    public static void main(String[] args) {

        Circle c1 = new Circle();

        System.out.println(Volume.a);
    }
}
