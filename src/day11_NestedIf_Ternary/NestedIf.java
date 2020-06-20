package day11_NestedIf_Ternary;
/*
            90 ~ 100 ==> A
            80 ~ 89 ==> B
            70 ~ 79 ==> C
            60 ~ 69 ==> D
            0 ~ 59 ==> F
            other ==> Invalid
 */

public class NestedIf {

    public static void main(String[] args) {
        int score  = 100;
        String result = "";

        if(score >=0 && score <= 100){  // valid score

            if(score >= 90  ){
                result = "A";
            } else if(score >= 80){
                result = "B";
            }else if(score >= 70 ){
                result = "C";
            } else if(score >= 60 ){
                result = "D";
            }else{
                result = "F";
            }

        }else{  // invalid score
            result = "Invalid";
        }

        System.out.println(result);

        System.out.println("======================================");

        /*
        Task01:
            precondition: minimum salary of 30k
                sub condition: minimum 2 years of job history
        Task02:
            1 monday
            2 Tuesday
            3 Wednesday
            ...
            7 Sunday
            invalid ==> there is no such a day

        Task03:
            write a program that can find the number of days in a months
                        (MUST APPLY NESTED IF)

        come back at: 3:25;
         */



    }


}
