package day07_Unary_ShortHand;

public class ShortHand {

    public static void main(String[] args) {
        int a = 100;
      //   a = a * a;
        a *= a;

        System.out.println(a);

        int b = 2;
        b *= 3;
        System.out.println(b);

        int c = 300;
        c -= 100;

        System.out.println(c);

        System.out.println("================================");

        // +=:
            int z = 300;
            z += 200; // z = z + 200

        System.out.println(z);

        String schoolName = "Cybertek";
            //    schoolName = schoolName + " School";
        schoolName += " School";

        System.out.println(schoolName);


        String fullName = "Mickey";
                fullName += " Mouse";

        System.out.println(fullName);





    }

}
