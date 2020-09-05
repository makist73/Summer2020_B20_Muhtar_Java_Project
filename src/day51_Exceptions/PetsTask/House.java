package day51_Exceptions.PetsTask;

public class House {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Winton","Scotty Terrier",'M',4, "Black");

        System.out.println( dog1.name );

        System.out.println(dog1);

        Cat cat1 = new Cat("Welat", "British Short hair", 'M',1, "White" );

        System.out.println(cat1);

        Tiger tiger1 = new Tiger("Zara","Caspian",'M',12,"Brown");

        System.out.println(tiger1);

        tiger1.eat();
        tiger1.drink();

    }
}
