package Library;

public class Util {

    // import Library.Util;

    public static String removeDup(String str){
        String nonDup = "";

        for( String each : str.split("") ){
            if( !nonDup.contains(each) ){
                nonDup += each;
            }
        }

        return nonDup;
    }
        // removes the duplicates and returns the value string

    public static String reverse(String str){
        String result = "";
        for(int i = str.length()-1;  i >=0 ; i--){
            result += str.charAt(i);
        }
        return result;
    }
        // reverse the string and retunr the value

    public static int frequency(String str, char ch){
        int count = 0;
        for(char each  : str.toCharArray() ){
            if(each == ch){
                count++;
            }
        }

        return count;
    }
    //  finds the frequency of char from string str and returns it as int

    public static String uniques(String str){
        String uniques = "";

        for(char each  : str.toCharArray() ){
            int count =frequency(str, each);  // frequency of every character
            if(count == 1){
                uniques += each;
            }
        }

        return uniques;
    }
      // retunrs the uniiques from the string

    public static String frequencyOfChars(String str){

        String expectedResult = "";
        String nonDup =    Util.removeDup(str);

        for(char each : nonDup.toCharArray() ){
            int count1 = Util.frequency(str, each);
            expectedResult +=   ""+ each + count1;
        }

        return expectedResult;
    }
        // returns the frequency of every single characters from a string

    public static  String  formatFullName(String first , String last){
        first = first.substring(0, 1).toUpperCase() +  first.substring(1).toLowerCase();
        last = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();
        String fullName = first + " " +last;

        return fullName;
    }
    // formats the full name





    public static int maxNum(int[] arr){
        int max = arr[0];

        for( int each : arr ){
            if(each > max){
                max = each;
            }
        }

        return max;
    }
    // find and returns the max number from in array

    public static int minNum(int[] arr){
        int min= arr[0];

        for( int each : arr ){
            if(each < min){
                min = each;
            }
        }

       return min;
    }
    // find and returns the min number from in array

    public static int[] combine2Arrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;
        for(int each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(int each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;
    }
    // combines two array and returns it

    public static int[] addElement(int[] arr, int num){
        int[] arr2 = new int[arr.length+1];
        arr2[arr2.length-1] = num;

        int i =0;
        for(int each: arr){
            arr2[i]  = each;
            i++;
        }

        return arr2;
    }
        // inserts the element to the array


}
