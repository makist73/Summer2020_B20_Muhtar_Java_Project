package day41_Static;

import java.util.ArrayList;

public class CarpetObjects2 {
    public static void main(String[] args) {
        Carpet[]  carpets = { new Carpet() , new Carpet(), new Carpet(), new Carpet(), new Carpet()  };
        //   0              1             2                3            4
        carpets[0].customOrder(4.5,3.5,17.5,false);
        carpets[1].customOrder(5.5,3.5,18.5,true);
        carpets[2].customOrder(4.5,5.5,19.5,false);
        carpets[3].customOrder(3.5,4.5,20.5,true);
        carpets[4].customOrder(6.5,5.5,21.5,true);


        ArrayList<Carpet> persianCarpets = new ArrayList<>();

        ArrayList<Carpet> regularCarpets = new ArrayList<>();




    }
}
