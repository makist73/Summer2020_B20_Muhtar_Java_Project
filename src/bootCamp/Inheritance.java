package bootCamp;

class  Shape{
    public String name;

    protected double area(){
        return 0;
    }

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

public class Inheritance {
    public static void main(String[] args) {

    }
}
