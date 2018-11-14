package day_41_constructor;

import java.io.FileNotFoundException;

public class CatOwner {

	public static void main(String[] args) throws FileNotFoundException {
		Cat c = new Cat("male", "regular american");
		System.out.println(c.gender);

		Cat c2 = new Cat("female", "British", -6);
		System.out.println(c2.age);

	}
}
