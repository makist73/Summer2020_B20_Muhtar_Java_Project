package day43_Static;

public class studentObjects {

    public static void main(String[] args) {

        CybertekStudent obj1 =new CybertekStudent();
        obj1.studentName = "Ivan";

        CybertekStudent obj2 =new CybertekStudent();
        obj2.studentName = "Cristina";

        System.out.println(obj1.studentName);
        System.out.println(obj2.studentName);

        System.out.println(obj1.schoolName);
        System.out.println(obj2.schoolName);

        System.out.println( CybertekStudent.schoolName );

    }
}
