package day_42_encapsulation;

public class Store {
	public static void main(String[] args) {
		Apple a = new Apple();
		a.setColor();
		a.setSize();

		Human h1 = new Human();
		h1.setAge(100);
		System.out.println(h1.getAge());
		h1.setGender("male");
		System.out.println(h1.getGender());

		Human h2 = new Human();
		System.out.println(Human.todaysDate);
		h1.todaysDate = "Nov 6th, 2018";
		System.out.println(h2.todaysDate);
		System.out.println(Human.todaysDate);

	}
}
