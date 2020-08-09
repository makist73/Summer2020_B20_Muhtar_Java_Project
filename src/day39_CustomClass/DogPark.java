package day39_CustomClass;

public class DogPark {

    public static void main(String[] args) {
        // dogPark

        Dog dog1 = new Dog();


        Dog[] dogPark = { new Dog(),  new Dog(), new Dog(), new Dog(), new Dog()  };
            //               0           1          2         3            4

        dogPark[0].setDogInfo("Karaoglan", "German Shepperd", "Medium",  6, "Black");
        dogPark[1].setDogInfo("Roko", "German Sheper", "Medium", 3, "Brown");
        dogPark[2].setDogInfo("Champ" , "Retriver", "small", 5, "Black");
        dogPark[3].setDogInfo("Akbas", "Anatolian Sheppard", "Large",  2, "White");
        dogPark[4].setDogInfo("Grizzly","BoxerPitt","Large",3,"Mix");
        //dogPark[5].setDogInfo("Pasa", "Pitbull","large", 1, "White");

        for(int i=0; i <= dogPark.length-1; i++ ){
            dogPark[i].getDogInfo();
        }


        System.out.println("=====================================================");

        for(Dog eachDog : dogPark ){
            eachDog.getDogInfo();
        }

        System.out.println("====================================================");
        String food = "treats";
        for( Dog eachDog  : dogPark ){
            eachDog.eat(food);
        }

        System.out.println("=====================================================");
        String drink = "milk";
        for( Dog eachDog  : dogPark ){
                eachDog.drink(drink);
        }

        System.out.println("====================================================");
        // play
        for( Dog eachDog  : dogPark ){
            eachDog.play();
        }

        System.out.println("====================================================");
        // sleep
        for( Dog eachDog  : dogPark ){
            eachDog.sleep();
        }



    }

}
