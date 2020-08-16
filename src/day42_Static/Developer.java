package day42_Static;

public class Developer {

    String name;
    char gender;
    long employeeID;
    String jobTitle;
    double salary;

    public void setInfo(String name, char gender,long employeeID, String jobTitle, double salary){
        this.name=name;
        this.employeeID=employeeID;
        this.jobTitle=jobTitle;
        this.salary=salary;
        this.gender = gender;
    }

    public void coding(){
        System.out.println(name+" is coding");
    }

    public void fixBug(){
        System.out.println(name+" is fixing the bug");
    }

    public String toString(){
        return "Name: "+name+", Gender: "+gender+", Job Title: "+jobTitle+", Salary: "+salary+", Employee ID: "+employeeID;
    }

}
