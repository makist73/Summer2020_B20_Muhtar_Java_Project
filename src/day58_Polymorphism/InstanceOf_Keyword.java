package day58_Polymorphism;

import day55_Abstraction.ShapesTask.*;
import day58_Polymorphism.AnimalTask.Animal;
import day58_Polymorphism.AnimalTask.Cat;
import day58_Polymorphism.AnimalTask.Dog;

public class InstanceOf_Keyword {

    public static void main(String[] args) {

        Animal animal1 = new Animal(10, 'F');
        Animal animal2 = new Dog("Winston",4, 'M');
        Animal animal3 = new Cat("Kiko",2,'M');

        // verify animal3 is the object of Animal class
        boolean r1 = animal3 instanceof Animal; // IS A relation ==> true
        System.out.println(r1);

        // verify animal3 is the object of Cat class
        boolean r2  = animal3 instanceof Cat;
        System.out.println(r2);

        // verify animal3 is the object of Dog class
        boolean r3 = animal3 instanceof Dog; // there is no "IS A relation" ==> false
        System.out.println(r3);

        boolean r4 = animal2 instanceof Animal;  // Dog is Animal
        System.out.println(r4);

        System.out.println(animal2 instanceof Dog); // Dog is Dog

        System.out.println(animal1 instanceof Dog); // Animal is A Dog

        System.out.println(animal2 instanceof Cat); // Dog is Cat

        System.out.println("==============================================");

        Shape shape1 = new Rectangle(3, 5);

        identifyShape(shape1);

        Circle c1 = new Circle(3);
        Circle c2 = new Circle(3);

        System.out.println( equalShapes(c1, c2) );

    }

   public static void identifyShape(Shape shape){
        if(shape instanceof Circle){
            System.out.println("The shape is circle");
        }else if(shape instanceof Cylinder){
            System.out.println("The shape is cylinder");
        }else{
            System.out.println("The shape is rectangle");
        }
   }

   public static boolean equalShapes(Shape shape1, Shape shape2){
        boolean result = false;

        boolean bothCircle = shape1 instanceof Circle && shape2 instanceof Circle;

        if(bothCircle){
            Circle c1 = (Circle)shape1;
            Circle c2 = (Circle)shape2;
            if(c1.radius == c2.radius){
                result = true;
            }
        }

        return result;
   }


}
