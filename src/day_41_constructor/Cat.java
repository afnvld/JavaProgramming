package day_41_constructor;

public class Cat {

	String gender;
	String breed;
	boolean shy;
	int age;
	String color;
	String behaviour;

	public Cat(String gender1, String breed1, int age1) {
		gender = gender1;
		breed = breed1;
		if (age1 > 0 && age1 < 15) {
			age = age1;
		} else {
			System.out.println("Invalid age. Your cat age will be zero!");

		}

	}

	public Cat(String gender1, String breed1) {
		gender = gender1;
		breed = breed1;
		System.out.println("Cat constructor is getting called");
	}

	public void eat() {
		System.out.println("Cat is eating");
	}

}
