package homeWork;


import java.util.*;

public class Alphabet {

	public static void main(String[] args) {
		/*
		 * Write a Java program that takes the user to provide a single character 
		 * from the alphabet. Print Vowel or Consonant, depending on the user input. 
		 * If the user input is not a letter (between a and z or A and Z), 
		 * or is a string of length > 1, print an error message.
		 */
	Scanner scan = new Scanner(System.in);
	System.out.println("Input an alphabet: ");
	char input = scan.next().charAt(0);
	boolean vowel = false;
    boolean consonant = false;
	char[] vowels = {'a', 'e', 'y', 'u', 'i', 'o'};
	char [] consonants = {'q', 'w', 'r', 't', 'p', 's', 'd', 'f', 
			               'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
	
	for (int v = 0; v< vowels.length; v++) {
		if (input == vowels[v]) {
			System.out.println(input + " is a vowel.");
			vowel = true;
		}
	}
	for (int c = 0; c <consonants.length; c++) {
		if (input == consonants[c]) {
	System.out.println(input + " is a consonant.");
			consonant = true;
		}
	}
//	if (vowel == false) {
//		System.out.println(input + " is consonant.");
//		
//	}
	
	if(true) {
		System.out.println(input + " is an invalid input.");
		
	}
	
					
		
		
		
		
		
	}

}
