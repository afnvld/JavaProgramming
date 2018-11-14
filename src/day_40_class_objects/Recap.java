package day_40_class_objects;

public class Recap {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.breed = "chow chow";
		dog1.size = 5;
		dog1.age = 2;

		dog1.eat();
		System.out.println(dog1.age);
		System.out.println(dog1.breed);
		dog1.eat("pizza");

		House arlo = new House();
		arlo.address = "75 Main St";
		arlo.type = "classic townhouse";
		arlo.numRooms = 5;
		
		House noMad = new House();
		noMad.address= "575 Madison";
		noMad.type= "apartment";
		noMad.numRooms=3;
		
		System.out.println(arlo.address);
		

	}

}
