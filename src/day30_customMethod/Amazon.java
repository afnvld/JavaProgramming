package day30_customMethod;

import java.util.Arrays;
import java.util.Scanner;

public class Amazon {

	public static void main(String[] args) {
		System.out.println("This is Amazon app");
		System.out.println("Please login");
		System.out.println("username: ");
		Scanner scan = new Scanner(System.in);
		String username = scan.nextLine();
		System.out.println("password: ");
		String pass = scan.nextLine();
		welcome(username);
		System.out.println("\n\nEnd of Amazon program");
		
	}
	//create a method that accepts String and says welcome user
	public static void welcome (String user) {
		System.out.println("Welcome," + user + "!!!");
		
	}
}
