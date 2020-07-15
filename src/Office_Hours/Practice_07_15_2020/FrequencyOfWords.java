package Office_Hours.Practice_07_15_2020;

public class FrequencyOfWords {

    public static void main(String[] args) {
        String str = "dog dog dog cat cat cat";

        int countOfDog = 0; // 1+1+1

        while(str.contains("dog")){//: true true true false

            str = str.replaceFirst("dog", "");
                    //"dog dog"
                    //"dog"
                    //""
            countOfDog++;
        }

        int countOfCat = 0;




        System.out.println(countOfDog);
        System.out.println(str);




    }

}
