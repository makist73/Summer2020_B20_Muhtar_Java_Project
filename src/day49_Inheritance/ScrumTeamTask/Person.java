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


    private void eat(){ // we dont want this to be inherited to the sub classes
        System.out.println(name +" is eating");
    }

    private void walk(){// we dont want this to be inherited to the sub classes
        System.out.println(name +" is walking");
    }

    private void sleep(){// we dont want this to be inherited to the sub classes
        System.out.println(name +" is sleeping");
    }


}
