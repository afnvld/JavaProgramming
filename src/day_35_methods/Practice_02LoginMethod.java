package day_35_methods;

import java.util.Scanner;

public class Practice_02LoginMethod {

	public static void main(String[] args) {
		login();
		}
	
	public static void login () {
		String expectedId ="johnJava";
		int expectedPass =123456;
		
		System.out.println("You have clicked to login buttom: ");
		System.out.println("Please enter login name: ");
		
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		
		System.out.println("Please enter password: ");
		int pass = scan.nextInt();
		if( expectedId.equals(name) && expectedPass == pass){
			System.out.println("Login successful");
			
		}else {
			System.out.println("Either your pass or id is not correct");
		}
		
	}

}
