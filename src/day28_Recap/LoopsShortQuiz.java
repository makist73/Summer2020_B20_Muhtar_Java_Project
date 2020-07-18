package day28_Recap;

public class LoopsShortQuiz {
    public static void main(String[] args) {
        int a = 0;

        while(a <= 6){ // true a =2,   true a=4,  true a = 6, true a = 8, false
            a+=2;
        }

        System.out.println(a);

        int i =0;
        int j = 7;
        //            6
        for(i=0; i < j-1; i +=2){ //i: 0  2 4 6

            System.out.print(i +" "); //0 2 4

        }

        System.out.println();
        System.out.println(i);

        for(int k = 0; k<=4;  ){
            k++; // k: 1 2 3 4 5
            System.out.print(k+" ");

          //  k++; // 0 1 2 3 4
        }

        System.out.println();

        int z = 5; // 5+5+4+3+2+1 = 20
        for(int q = 5; q > 0; q--){ //Q: 5 4 3 2 1
            z += q;
        }


    }

}
