package day51_Exceptions.PetsTask;

public class Dog extends Pet {


    public Dog(String name, String breed, char gender, int age, String color ) {
        super(name, breed, gender, age, color);  // calling parent constructor (Mandatory)
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

}
