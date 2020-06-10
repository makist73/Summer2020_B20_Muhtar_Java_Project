package day05_ArithmeticOperators;
/*
Warmup tasks:
        1. create a class named EmployeeInfo
                declare the following variables:
                    firstName, lastName, gender, age, companyName, jobTitle, isFullTime, isMarried, salary

            write a program that can display the full info of the employee
                    ex:
                             firstName = John
                             lastName = Daniel
                             gender = Male
                             age = 35
                             companyName = CapitalOne
                             jobTitle = SDET
                             isFullTime = true
                             isMarried = false
                             salary = 120000.50

             output:
                        Employee' full name is: John Daniel
                        John Daniel' gender is: Male
                        John Daniel' age is: 35 years old
                        John Daniel works at: CapitalOne
                        John Daniel' Job title is: SDET
                        John Daniel' salary is 120000.5 $
                        John Daniel is full time employee: true
                        John Daniel is married: false
*/

public class EmployeeInfo {

    public static void main(String[] args) {
//firstName, lastName, gender, age, companyName, jobTitle, isFullTime, isMarried, salary
        String firstName = "Aaron";
        String lastName = "Jones";
        int age = 45;
        String companyName = "CapitalOne";
        char gender = 'M';
        String jobTitle = "QA";
        boolean isFullTime = true;
        boolean isMarried = false;
        double salary = 120_000.50;

        System.out.println("Employee' full name is: " + firstName+" " + lastName );
        System.out.println( firstName+" " + lastName + "'s gender is: "  + gender );
        System.out.println( firstName+" " + lastName +"'s age is: " + age + " years old" );
        System.out.println( firstName+" " + lastName  + " works at: "+companyName );
        System.out.println(firstName+" " + lastName +"'s job title is: " + jobTitle);
        System.out.println(firstName+" " + lastName+"'s salary is: $"+salary );
        System.out.println( firstName+" " + lastName +" is full time employee: "+ isFullTime);
        System.out.println( firstName+" " + lastName +" is married: " + isMarried);


    }




}