package day24_Arrays;

public class UniqueWords2 {

    public static void main(String[] args) {
        String[] words = {"C#", "C#", "Java", "Python", "Python", "C++", "Ruby"};

        for(String each: words){
            int count = 0;
            for( String b  : words  ){ // b represents each elemnts in the array
                if(each.equals(b)){
                    count++;
                }
            }

            if(count == 1){
                System.out.println(each);
            }

        }







    }

}
