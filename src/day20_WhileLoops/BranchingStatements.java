package day20_WhileLoops;

public class BranchingStatements {

    public static void main(String[] args) {

        char ch = 'A';

        while(ch <= 'E'){
            if(ch == 'C'){
                ch++;
               continue; // skips everything even the iterator
              //  break;
            }

            System.out.println(ch);

            ch++;
        }




    }

}
