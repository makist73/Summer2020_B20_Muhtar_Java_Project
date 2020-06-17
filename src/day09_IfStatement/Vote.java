package day09_IfStatement;

public class Vote {

    public static void main(String[] args) {
        int age = 35;
        boolean usCitizen = true;

        if( age >= 18 && usCitizen ){
            System.out.println("Eligible to vote for Trump");
        }else{
            System.out.println("Not Eligible to vote for Trump" );
        }




    }

}
