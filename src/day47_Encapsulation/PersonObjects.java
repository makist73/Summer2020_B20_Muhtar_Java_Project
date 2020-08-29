package day47_Encapsulation;

import java.time.LocalDate;

public class PersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Jake", 34, 'M', LocalDate.of(1988, 4, 5));

        System.out.println(person1);

       // person1.ssn = 4321;
        person1.setSsn(987654);
        person1.setID(98);
        person1.setAddress("California");

        System.out.println("SSN: "+ person1.getSsn());
        System.out.println("ID: "+ person1.getID() );
        System.out.println("Address: "+ person1.getAddress());

    }

}
