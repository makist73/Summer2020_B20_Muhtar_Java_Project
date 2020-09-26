package day58_Polymorphism;

import day57_Polymorphism.PhoneTasks.*;

import java.util.ArrayList;
import java.util.Arrays;

public class PhoneShop {
    public static void main(String[] args) {
        Phone[] phone = {
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Samsung("S20", "7", 1100),
                new Samsung("S20", "7", 1100),
                new Samsung("S20", "7", 1100)
        };


        ArrayList<Phone> phoneShop = new ArrayList<>(Arrays.asList(phone) );
        int countIphone =0;
        int countSamSung = 0;
        int countHuaWei =0;

        for(int i = 0; i <= phoneShop.size()-1; i++){
            if( phoneShop.get(i) instanceof Iphone  ){
                countIphone++;
            }else if(phoneShop.get(i) instanceof Samsung){
                countSamSung++;
            }

        }





    }
}
