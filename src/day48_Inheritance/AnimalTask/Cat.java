package day48_Inheritance.AnimalTask;

public class Cat extends Animal {

    /*
    variables: 4
    methods: 6
     */

    public Cat(String name, String size, int age, char gender) {
        setInfo(name, size, age, gender);
    }

    public void meow(){
        System.out.println(name + " meowing");
    }



}
