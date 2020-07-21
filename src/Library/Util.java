package Library;

public class Util {

    public static String removeDup(String str){
        String nonDup = "";

        for( String each : str.split("") ){
            if( !nonDup.contains(each) ){
                nonDup += each;
            }
        }

        return nonDup;
    }


    public static String reverse(String str){
        String result = "";
        for(int i = str.length()-1;  i >=0 ; i--){
            result += str.charAt(i);
        }
        return result;
    }


    public static void maxNum(int[] arr){
        int max = arr[0];

        for( int each : arr ){
            if(each > max){
                max = each;
            }
        }

        System.out.println("Max: "+max);
    }


}
