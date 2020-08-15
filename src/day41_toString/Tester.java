package day41_toString;

public class Tester {

    String name;
    double salary;
    String gender;
    int age;

    public void setInfo(String name, double salary, String gender, int age){
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.age = age;
    }

    public String toString(){
        return "Name: "+name+", Gender: "+gender+", Age: "+age+", Salary: "+salary;
    }

}
