package day26_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDArray_Practice1 {
    /*
            Testers: {"Liliia", "Odina", "Cristina", "Elkem"  }
            Developers: {"Ahmet", "Erfan", "Roza", "Sarah"}
            SM: {"Nurmamet"}
            PO: {"Nadir"}
            BA: {"Alex"}

            scrumTeam:  testers, Developer, SM, PO, BA
     */

    public static void main(String[] args) {
        String[] testers = {"Liliia", "Odina", "Cristina", "Elkem"  };
        String[] developers = {"Ahmet", "Erfan", "Roza", "Sarah"};
        String[] SM = {"Nurmamet"};
        String[] PO = {"Nadir"};
        String[] BA = {"Alex"};

            String[] testers2 = {"Irene", "Aslan", "Nazar"};

        String[][] scrumTeam = { testers, developers, SM,  PO,  BA};
                    //             0          1         2   3   4

        System.out.println(Arrays.deepToString(scrumTeam));

        scrumTeam[4][0] = "Adam";
        scrumTeam[1][2] = "Emine";
        scrumTeam[0]= testers2;
        scrumTeam[3][0] = "Zeki";

        System.out.println(Arrays.deepToString(scrumTeam));
        System.out.println("==========================================");
        for( String[] each : scrumTeam ){
            for(String name  : each){
                System.out.println(name);
            }
           // System.out.println( Arrays.toString(each) );
        }


/*
[Irene, Aslan, Nazar]
[Ahmet, Erfan, Emine, Sarah]
[Nurmamet]
[Zeki]
[Adam]
 */

    System.out.println("=======================================================================");

    int[][] scores = { {10, 20, 30, 45}, {60, 55, 75, 105}, {93, 48, 125, 135, 13}   };
    //                      0                    1                  2
    // print out the numbers that are divisible by 3 or 5

        for( int[] each1DArray   : scores){

            for(int eachElement   : each1DArray ){
                if(eachElement % 3 ==0  || eachElement % 5 ==0 ) {
                    System.out.print(eachElement + " ");
                }

            }

        }


        System.out.println("===================================");
        int[][] a1 = {{1,2},{3,4,5}};
        int[][] a2 = {{6,7},{8,9,10} };

        int[][][]  arr3D = {  {{1,2},{3,4,5}}  ,   {{6,7},{8,9,10} }  };
       //                           0                      1


    }


}
