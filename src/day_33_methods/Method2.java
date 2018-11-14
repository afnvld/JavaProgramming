package day_33_methods;

import java.util.Arrays;

public class Method2 {

	public static void main(String[] args) {
		char[]mm= stringToChar("Adina");//catching method
		System.out.println(Arrays.toString(mm));
		
	}
	//create char array with size of letters 
	//loop through each letter and assign each position of newly created char array
	//return created char array
	
	
	public static char[] stringToChar (String word) {
		int size = word.length();
		System.out.println("size" + size);
		
		char [] myChars= new char [size];
		for (int i =0; i < size; i++) {
			System.out.println(word.charAt(i));
			myChars[i]= word.charAt(i);
		}
			System.out.println(Arrays.toString(myChars));
			return myChars;
	}

}
