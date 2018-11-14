package day21_practice;

import java.util.Scanner;

public class FindHowManyTimes {
	public static void main(String[] args) {
		/*
		 * 2. Accept a String and a character.
		 * Find out how many times that character appears in the string.
		 */
	Scanner input =new Scanner(System.in);
	System.out.println("Enter world");
		String word = input.next();
		//int gh = input.nextInt();
		
		//word = word.toLowerCase();
		System.out.println("Enter character: ");

		char ch = input.next().charAt(0);
		
		int counter = 0;
		for(int i=0; i < word.length(); i++) {
			//System.out.println(word.charAt(i));
			if(word.charAt(i) == ch) {
				//System.out.println("found c");
				counter++;
			}
		}
		System.out.println(counter);
		
	}
}