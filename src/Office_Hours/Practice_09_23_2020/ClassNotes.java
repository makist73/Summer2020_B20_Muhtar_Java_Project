package Office_Hours.Practice_09_23_2020;

public class ClassNotes {

    /*
    09/23/2020
Practice Topics: OOP Abstraction

Package Name: Practice_09_23_2020

Abstraction: hiding the implementation

	abstract method: method without implementation/body
					we give the implementation when we override
					meant to be overriden

	2 ways to achieve:
			1. abstract class: can have all methods and variables the regular class can + abstract methods

			2. Interface: specifies the actions and behaviors of the class need to implement
					 can have methods and variables, but:
					 			variables: public static final by default

					 			methods: abstract, static, default methods

					 			can only use PUBLIC


Shapes task example from last class

    interface Volume:
            hasVolume = true;
            calculateVolume();

    abstract class Shape:
         calculateArea();
         calculatePerimeter();


    Square: extends Shape
         calculateArea(){ }
         calculatePerimeter(){ }


    Rectangle: extends Shape
         calculateArea(){ }
         calculatePerimeter(){ }

    Cylinder: extends Shape implements Volume
         calculateArea(){}
         calculatePerimeter(){}
         calculateVolume(){}




ex:
	Interface AutoPilot:
		autoPilot();

	abstract Class Car: brand, model, year, price
			start();
			driver();


	BWM: extends Car
		 brand, model, year, price... instance
		 start(){}
		 driver(){}

		bmw1: x5
		bmw2: x3
		bmw3: x6


	Toyota: extends Car
		brand, model, year, price...   instance
		start();
		driver();

		toyota1: Camry
		toyota2: Corolla
		toyota3: Avalon

     */
}
