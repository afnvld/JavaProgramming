package day_33_methods;

import java.util.Arrays;

public class Method3 {

	public static void main(String[] args) {
		String [] names = {"james", "adam", "lala", "pkjih"};
		printWords(names, 5);

	}
	
	/*
	 * Create method that accepts String array and integer (size)
	 *  that prints out Strings with the given size
	 */
	
	public static void printWords(String[] words, int size) {
		for(String each: words) {
			if(each.length()==size) {
				System.out.println(each);
			}
		}
		
			
	}

}
