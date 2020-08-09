package day39_CustomClass;

public class DogObjects {


    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.setDogInfo("Siwan","Beagle","medium",2,"Mix");
        dog2.setDogInfo("Roofus", "Argentinian Dogo", "Large", 1, "White");
        dog3.setDogInfo("Winston", "Scotties Terrier", "Small", 1, "Black");

        dog1.getDogInfo();
        dog2.getDogInfo();
        dog3.getDogInfo();


        dog1.eat("Kelle Paca");
        dog3.eat("Steak");
        dog2.eat("polo");


        dog3.drink("cola");
        dog1.drink("milk");
        dog2.drink("redbull");

        dog1.sleep();
        dog2.sleep();
        dog3.sleep();



    }

}
