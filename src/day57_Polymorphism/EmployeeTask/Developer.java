package day57_Polymorphism.EmployeeTask;

public class Developer extends Employee{

    public Developer(String name, int id, String jobTitle, double salary, char gender) {
        super(name, id, jobTitle, salary, gender);
    }

    @Override
    public void work() {
        System.out.println("Developer "+name+" is working");
    }
}
