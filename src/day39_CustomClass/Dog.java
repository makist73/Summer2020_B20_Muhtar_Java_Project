package day39_CustomClass;

public class Dog {
/*
	instance variables:
			name, breed, size, age, color

	instance methods:
			setDogInfo, getDogInfo, eat, drink, sleep, ...
 */
       String name;
       String breed;
       String size;
       int age;
       String color;

    public void setDogInfo(String dogName, String dogBreed, String dogSize, int dogAge, String dogColor){
        breed = dogBreed;
        size = dogSize;
        age = dogAge;
        color = dogColor;
        name = dogName;
    }
    // sets the info of the dog


    public void getDogInfo(){
        System.out.println("Name: "+name+", Breed: "+breed+", Size: "+size+", Color: "+color+", Age: "+age+" years old");
    }
    // prints the dog info


    /*
    dog1: husky
    dog2: pitbull
    dog3: golden retriever
     */


}
