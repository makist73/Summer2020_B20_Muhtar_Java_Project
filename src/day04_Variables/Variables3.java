package day04_Variables;
/*
declare the following variables:
          String  employeeName
          int  employeeID
          String  jobTitle
          double  salary
          char  gender (char)
          boolean  isFullTime (boolean)
 */
public class Variables3 {

    public static void main(String[] args) {
        // school name: Cybertek School
        String schoolName = "Cybertek School";

        System.out.println(schoolName);

        System.out.println("===================================");

        String employeeName = "Zeliha"; // "employee Name: " + employeeName
        String employeeID = "C11";
        String jobTitle = "QA";
        double salary = 100_000;
        char gender ='F';
        boolean isFullTime = false;

        System.out.println("Employee Name is " + employeeName);
        System.out.println( "Employee ID is " + employeeID);
        System.out.println( "Job Title is " + jobTitle);
        System.out.println("Salary is " + salary + " USD" );
        System.out.println( "Gender: "  + gender);
        System.out.println("Full Time: " +isFullTime);






    }

}
