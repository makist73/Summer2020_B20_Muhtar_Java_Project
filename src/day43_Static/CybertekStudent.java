package day43_Static;

class A{
    static int  a = 200;
}

public class CybertekStudent {
    // for the advantages of static

    String studentName;
    int age;
    char gender;
    static  String schoolName = "Cybertek School";


    public  void getInfo(){
        System.out.println("Name: "+studentName);
    }

    public static void printSchoolName(){
        System.out.println("School Name: "+schoolName);
    }



}
