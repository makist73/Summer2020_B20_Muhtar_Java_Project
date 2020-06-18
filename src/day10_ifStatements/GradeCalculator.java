package day10_ifStatements;
/*
grade: int score = 95;
    score < 0 || score > 100 ==> Invalid
	90 ~ 100 ==> A
	80 ~ 89 ==> B
	70 ~ 79 ==> C
	60 ~ 69 ==> D
	otherwise ==> F
 */

public class GradeCalculator {

    public static void main(String[] args) {

        int score = -150;
        String grade = "";

        if(score >= 90 && score <= 100){ // 90 <= score <= 100
            grade = "You made  A";
        } else if( score >= 80 && score <= 89 ){  // 80 <= score <= 89
            grade = "You made  B";
        } else if(score >= 70 && score <= 79){ // 70 <= score <= 79
            grade = "You made  C";
        } else if(score >= 60 && score <= 69){ // 60 <= score <= 69
            grade = "you made  D";
        } else if(score >= 0 && score <= 59){  // 0<= score <= 59
            grade = "You made F";
        }else{ // score < 0 or score > 100
            grade = "Invalid Score";
        }

        System.out.println(grade);



    }


}
