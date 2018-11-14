package day14_stringmanipulation_cont;

import java.util.Scanner;

public class Dublicate {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter a word");
		String one = scanner.nextLine();
		System.out.println("Please enter another word");
		String two = scanner.nextLine();
		System.out.println(one + two + two + one);
		System.out.println(one.concat(two).concat(two).concat(one));
	//	System.out.print(one);
//		System.out.print(two);
//		System.out.print(two);
//		System.out.print(one);
		
		

	}
}
