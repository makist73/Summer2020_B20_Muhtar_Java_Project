package day19_ForLoop;

public class breakStatement {

    public static void main(String[] args) {

        for(int i =0; i < 5; i++){
            System.out.println("Hello");
            break;
        }

        System.out.println("============================");

        for(char ch = 'A'; ch <= 'H'; ch++){ // ch: A  B C

            if(ch == 'C'){
                break;
            }

            System.out.print(ch +" "); //A B

        }




    }


}
