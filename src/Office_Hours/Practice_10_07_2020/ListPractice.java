package Office_Hours.Practice_10_07_2020;

import java.util.*;

public class ListPractice {

    public static void main(String[] args) {

        List<String> list = new Vector<>();
        list.addAll(Arrays.asList("Nurbiye", "Emine", "Dawud", "Emine", "Emine") );
        //   index:                 0         1          2         3        4

        System.out.println(list);
        System.out.println(list.get(2));

        Stack<String> stack = new Stack<>();
        stack.addAll( list );

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);

        stack.pop(); // LIFO

        System.out.println(stack);

        stack.pop(); //Emine
        stack.pop(); // Nurbiye

        System.out.println(stack);







    }

}
