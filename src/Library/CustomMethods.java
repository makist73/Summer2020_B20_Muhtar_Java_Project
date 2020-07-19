package Library;

public class CustomMethods {


    public static void removeDup(String str){  //"abab"
        String nonDup = ""; //"ab"

        //[a, b, a, b]
        for( String each : str.split("") ){
            if( !nonDup.contains(each) ){
                nonDup += each;
            }
        }

        System.out.println(nonDup);
    }



    public static void reverse(String str){
        String result = "";
        for(int i = str.length()-1;  i >=0 ; i--){
            result += str.charAt(i);
        }
        System.out.println(result);
    }




}
