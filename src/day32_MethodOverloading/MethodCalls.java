package day32_MethodOverloading;
import Library.Util;
public class MethodCalls {

    public static void main(String[] args) {

        String firstName = "elKEm";
        String lastName = "emEt";

        String fullName;

        fullName = Util.formatFullName(firstName, lastName);

        System.out.println(fullName);

        String uniques = Util.uniques(fullName);

        System.out.println(uniques);

        String reversedName = Util.reverse(fullName);

        System.out.println(reversedName);


    }

}
