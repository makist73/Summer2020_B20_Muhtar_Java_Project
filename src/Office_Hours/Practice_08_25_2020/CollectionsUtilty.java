package Office_Hours.Practice_08_25_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Collections Utility:
		swap:
		sort:
		max:
		min:
		frequency:
 */

public class CollectionsUtilty {


    public static void main(String[] args) {

        ArrayList<Integer>  list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10,20,30,40,50,60,70,80, 90) );
        //                          0 1  2   3  4  5  6  7  8

        Collections.swap(list1, 0,1);
        Collections.swap(list1, list1.size()-2,  list1.size()-1);

        System.out.println(list1);


        Collections.sort(list1);

        System.out.println(list1);

        Integer max = Collections.max(list1);
        Integer min = Collections.min(list1);

        System.out.println("Maximum Number: "+max);
        System.out.println("Minimum Number: "+min);



    }

}
