package fridayPractice;

public class Puddle {
	public static void main(String[]args) {
		Dog puddle = new Dog();
		puddle.age = 2;
		puddle.color=" grey";
		puddle.pounds= 3.5;
		puddle.breed = " puddle";
		puddle.eat();
		puddle.sleep();
		
		String name = "Adina";
		//int letter = 0;
//		char[] letters = new char;
//		for ( char each: letters) {
//			System.out.println(each);
//		}
		
		String reverse = "";
		for (int i = name.length()-1; i >= 0; i--) {
			reverse += name.charAt(i);
		}
		System.out.println(reverse.toLowerCase());
	}
}
