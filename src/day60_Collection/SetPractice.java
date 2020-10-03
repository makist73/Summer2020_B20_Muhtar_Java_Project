package day60_Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetPractice {
// write aprogram that can remove duplicates from string

    public static void main(String[] args) {
        String str = "ddddddddcccccccbbbbbbbbaaaaaaaaa"; // dcba

        String[] arr = str.split("");

        System.out.println(Arrays.toString(arr)  ); //

        //

        Set<String> s1 = new LinkedHashSet<>();
        s1.addAll( Arrays.asList(arr) );

        System.out.println(s1);

        System.out.println("=========================");

        String str2 = "ttttyyyyyuuuuuuuiiiiiiaaaaaaaaa";

        str2 = new LinkedHashSet<>( Arrays.asList(str2.split(""))).toString() ;

        System.out.println(str2);

        str2 = str2.replace("[", "").replace(", ", "").replace("]","");

        System.out.println(str2);




    }

}
