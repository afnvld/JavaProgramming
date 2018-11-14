package day28_arrays;

import java.util.Scanner;

public class ArraysPrintFirstLastChar {

	public static void main(String[] args) {
		
	//	Scanner input = new Scanner(System.in);
		
		String [] words = {"hello", "why", "by", "apple", "note"};
		//we use for each loop bc we iterate every single loop, 
		//it doesn't skip any of the index. HIT THE KEY WORD
		for (String word : words ) {
											//"" for convert string to char
			System.out.println(word.charAt(0) + ""+ word.charAt(word.length()-1));
		}
		
		//Using Substring and print in single line 
		for (String word: words){
		System.out.println(word.substring( 0, 1) + word.substring(word.length()-1));
	}
		//using standard for loop
	for (int i = 0; i < words.length; i++) {
		System.out.println(words[i].substring(0, 1) + words[i].substring(words[i].length()-1));
	}

}
}