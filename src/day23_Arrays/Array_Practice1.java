package day23_Arrays;

public class Array_Practice1 {

    public static void main(String[] args) {
      //  String students = "Muhtar", "Nadir", "Asiya";

        String[]  students = {"Cybertek", "Muhtar", "Nadir", "Asiya", "Saim" };
        //                        0           1        2         3       4
            String  name1 =   students[4];

        System.out.println(name1);

        System.out.println("=======================================");

        int[] scores = {85,  70,  95,  90,  100};   // 5
        //              0     1    2    3    4

        String [] names = {"Mike", "Adam", "Tonny", "John", "Amy"};  // size: 5
        //                  0        1       2        3        4

        /*
        System.out.println(  names[0]  + " : " + scores[0] );
        System.out.println(  names[1]  + " : " + scores[1] );
        System.out.println(  names[2]  + " : " + scores[2] );
        System.out.println(  names[3]  + " : " + scores[3] );
        System.out.println(  names[4]  + " : " + scores[4] );
    */

        for(int i=0; i <= 4; i++){ // i: 0,1,2,3,4
            System.out.println(  names[i]  + " : " + scores[i] );
        }

        System.out.println("==========================================");

        String[] classMates = new String[5]; // size is 5,
        classMates[0] = "Fatih";
        classMates[2] = "Hazel";
        classMates[1] = "Viorel";
        classMates[3] = "Elkem";
        classMates[4] = "Ahmed";
     //   classMates[5] = "Muhtar";
        //

        for(int i = 0; i <= classMates.length -1 ; i++){
            System.out.println(classMates[i]);
        }







    }

}
