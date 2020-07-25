package day33_LocalDateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Times {

    public static void main(String[] args) {

        LocalTime t1 = LocalTime.of(23, 55,55);
        System.out.println(t1);

        LocalTime t2 = LocalTime.now();
        System.out.println(t2);


        LocalDateTime t3 = LocalDateTime.of(2020, 07,25,15,25);

        System.out.println(t3);

        LocalDateTime t4 = LocalDateTime.now();

        System.out.println(t4);


    }

}
