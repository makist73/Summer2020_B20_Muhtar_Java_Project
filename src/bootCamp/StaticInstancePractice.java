package bootCamp;

class Person{
    /*
    instance: name, age, gender
    static: isHuman, numberOfEyes
     */

    public String name;
    public int age;
    public char  gender;

    public Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static boolean isHuman ;
    public static int numberOfEyes;

    static{
        isHuman = true;
        numberOfEyes = 2;
    }


    public void printName(){
        System.out.println(name);
        System.out.println(isHuman);
    }



}

public class StaticInstancePractice {

    public static void main(String[] args) {
        Person person1 = new Person("Musa", 27, 'M');

        Person person2 = new Person("Mike", 28, 'M');


        System.out.println(person1.name);
        System.out.println(person2.name);

        System.out.println(person1.numberOfEyes);
        System.out.println(person2.numberOfEyes);

        System.out.println(Person.numberOfEyes);

    }

}
