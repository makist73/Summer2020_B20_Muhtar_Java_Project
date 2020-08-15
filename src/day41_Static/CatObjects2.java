package day41_Static;

public class CatObjects2 {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setCatInfo("Cass", 2, 'F', "Black", "Persian");

        Cat[] catPark = {cat1, new Cat(), new Cat(), new Cat(), new Cat(), new Cat() };

        catPark[1].setCatInfo("Puki",3,'M',"Orange","Abyssinian");
        catPark[2].setCatInfo("Miaw",1,'M',"White","Persian");
        catPark[3].setCatInfo("Reese",2,'F',"Gray","British Shorthair");
        catPark[4].setCatInfo("Yoyo",3,'F',"Brown and White","Siamese");
        catPark[5].setCatInfo("Lord", 8, 'M', "White", "Maine Coon");








    }

}
