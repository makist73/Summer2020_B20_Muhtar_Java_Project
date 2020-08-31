package day49_Inheritance.ScrumTeamTask;
/*
create a class called Person
                attributes:  name, age, gender
                methods: eat, walk, sleep, setPersonInfo
 */

public class Person {

    public String name;
    public int age;
    public char gender;


    private void eat(){
        System.out.println(name +" is eating");
    }

    private void walk(){
        System.out.println(name +" is walking");
    }

    private void sleep(){
        System.out.println(name +" is sleeping");
    }


}
