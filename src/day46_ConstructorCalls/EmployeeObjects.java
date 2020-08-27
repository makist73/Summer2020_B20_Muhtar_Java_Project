package day46_ConstructorCalls;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Cristina");

        System.out.println(employee1);

        System.out.println("=========================");

        Employee employee2 = new Employee("Selman", "QA");

        System.out.println(employee2);

        System.out.println("===========================");

        Employee employee3 = new Employee("Liliia", "SDET", 123456);

        System.out.println(employee3);

        System.out.println("===================================");
        Employee employee4= new Employee("Alex","SDET",123456,135_000.5);
        System.out.println(employee4);

        System.out.println("==============================");




    }

}
