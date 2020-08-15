package day41_toString_Practice;

import java.util.ArrayList;

public class CatObjects {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setCatInfo("Cass", 2, 'F', "Black", "Persian");

        System.out.println( cat1 );

        System.out.println("======================================");

        Cat[] catPark = {cat1, new Cat(), new Cat(), new Cat(), new Cat(), new Cat() };

        catPark[1].setCatInfo("Puki",3,'M',"Orange","Abyssinian");
        catPark[2].setCatInfo("Miaw",1,'M',"White","Persian");
        catPark[3].setCatInfo("Reese",2,'F',"Gray","British Shorthair");
        catPark[4].setCatInfo("Yoyo",3,'F',"Brown and White","Siamese");
        catPark[5].setCatInfo("Lord", 8, 'M', "White", "Maine Coon");

        for( Cat each : catPark ){
            System.out.println(each);
        }

        System.out.println("===========================================");

     //   System.out.println(Arrays.toString(catPark) );

            // element, element,

        ArrayList<Cat> femaleCats = new ArrayList<>();
        ArrayList<Cat> maleCats = new ArrayList<>();

        /*
        for(int i=0; i <= catPark.length-1; i++){
            if( catPark[i].gender == 'M'  ){
                maleCats.add(catPark[i]);
            }else{
                femaleCats.add(catPark[i]);
            }

        }
         */

        for(Cat each : catPark){
            if(each.gender == 'M'){
                maleCats.add(each);
            }else{
                femaleCats.add(each);
            }
        }


        System.out.println(femaleCats);
        System.out.println(maleCats);






    }


}
