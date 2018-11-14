package day_32_methods;

import java.util.Random;

public class ReturnMethod {

	public static void main(String[] args) {
		//method parameters, arguments
		//we can declare as many parameters as we want in java custom method creation
		//also we have option not to pass any parameter
		//a method that doesn't take any argument
		int i =getRandomBtwOneToHundred();
	}
	/**
	 * this method returns random number between 1 to 100
	 * @return
	 */
	 public static int getRandomBtwOneToHundred() {
		Random random = new Random();
		return random.nextInt(100);
	}
	/**
	 * This method 
	 * @param name
	 * @return
	 */
	 public static int getAge (String name) {
		if(name.equals("James")) {
			return 34;
		}
		else {
			return 55;
		}
	}

}
