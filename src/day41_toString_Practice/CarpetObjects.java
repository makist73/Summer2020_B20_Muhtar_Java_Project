package day41_toString_Practice;
/*
create an array of the carpet that contains 5 carpet objects
        ( make sure you set the instance variables of those objects)

            create two ArrayList of carpets:
                                        persianCarpets
                                        regularCarpets

            write a program to store all the persian Carpets into the list of persianCarpets, and store all regular carpets into the list of reugularCarpets

                    use for each loop to print out all the persian carpets

 */

import java.util.ArrayList;

public class CarpetObjects {


    public static void main(String[] args) {
        Carpet[]  carpets = { new Carpet() , new Carpet(), new Carpet(), new Carpet(), new Carpet()  };
                            //   0              1             2                3            4
                carpets[0].customOrder(4.5,3.5,17.5,false);
                carpets[1].customOrder(5.5,3.5,18.5,true);
                carpets[2].customOrder(4.5,5.5,19.5,false);
                carpets[3].customOrder(3.5,4.5,20.5,true);
                carpets[4].customOrder(6.5,5.5,21.5,true);

/*
        for( Carpet each: carpets ){
            each.getCarpetInfo();
        }
*/


        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        ArrayList<Carpet> regularCarpets = new ArrayList<>();

        /*
        for(int i = 0; i <= carpets.length-1; i++ ){
            if( carpets[i].isPersian ){
                persianCarpets.add( carpets[i]  );
            }else{
                regularCarpets.add( carpets[i] );
            }
        }

         */

        for(Carpet each : carpets ){
            if(each.isPersian){
                persianCarpets.add(each);
            }else{
                regularCarpets.add(each);
            }
        }


        System.out.println("Number of persian carpets: "+persianCarpets.size());
        System.out.println("Number of regular carpets: "+regularCarpets.size());



    }




}
