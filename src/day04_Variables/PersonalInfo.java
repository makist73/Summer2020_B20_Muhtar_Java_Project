package day04_Variables;
/*
task:
    create a class called PersonalInfo:
            first name
            last name
            country
            SSN
            Gender
            isEmployeed
 */

public class PersonalInfo {

    public static void main(String[] args) {
        String firstName = "Brian";
        String lastName = "Johnson";
        String country = "Turkey";
        char gender ='M';
        boolean isEmployeed = true;
        String SSN = "123-456-789";

        System.out.println("First name is "+firstName);
        System.out.println("Last name is "+lastName);
        System.out.println("Country: "+country);
        System.out.println("Gender: "+gender);
        System.out.println("Employeed: " +isEmployeed );
        System.out.println("SSN: "+ SSN);




    }

}
