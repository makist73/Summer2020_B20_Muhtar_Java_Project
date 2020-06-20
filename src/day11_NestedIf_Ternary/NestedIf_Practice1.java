package day11_NestedIf_Ternary;
/*
 Task01:
            precondition: minimum salary of 30k
                sub condition: minimum 2 years of job history
 */

public class NestedIf_Practice1 {

    public static void main(String[] args) {

        double salary = 29999;
        double jobHistory = 20;

        if(salary >= 30000){

            if(jobHistory >= 2){
                System.out.println("You are qualified");
            }else{ // jobHistory < 2
                System.out.println("You must have been on job at least 2 year");
            }

        }else{
            System.out.println("You MUST earn at least $30K");
        }




    }


}
