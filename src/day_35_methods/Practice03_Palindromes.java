package day_35_methods;

import java.util.Scanner;

public class Practice03_Palindromes {

	public static void main(String[] args) {
		
		String word = "civic";
		System.out.println(isPalindrome(word));
	}
	public static boolean isPalindrome (String name) {
		String str="";
		
		for (int i = name.length()-1; i >=0; i--) {
			str += name.charAt(i);
		}
		if(!str.equals(name)) {
			return false;
		}else {
			return true;
		}
		
	}

}
