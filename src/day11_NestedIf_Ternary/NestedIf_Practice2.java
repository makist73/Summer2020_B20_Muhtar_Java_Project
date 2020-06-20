package day11_NestedIf_Ternary;

public class NestedIf_Practice2 {
    /*
    Task02:
            1 monday
            2 Tuesday
            3 Wednesday
            ...
            7 Sunday
            invalid ==> there is no such a day
     */

    public static void main(String[] args) {
        int day = 4;
        boolean validNumber = day >= 1 && day <= 7;

        String result = "";

        if(validNumber){ // 1<= day <= 7

            if(day == 7){
                result = "Sunday";
            }else if(day == 6){
                result = "Saturday";
            }else if(day == 5){
                result = "Friday";
            }else if(day == 4){
                result = "Thursday";
            }else if(day == 3){
                result = "Wednesday";
            }else if(day == 2){
                result = "Tuesday";
            }else{ // day ==1
                result = "Monday";
            }

         /*
            result= (day == 7) ? "Sunday" :(day == 6)? "Saturday" : (day == 5) ?"Friday"
                     :(day == 4)? "Thursday" :(day == 3)? "Wednesday" :(day == 2)? "Tuesday"
                     : "Monday";
          */

        }else{  // invalid number
            result = "Invalid";
        }

        System.out.println(result);



    }

}
