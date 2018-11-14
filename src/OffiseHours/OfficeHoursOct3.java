package OffiseHours;

import java.util.Scanner;

public class OfficeHoursOct3 {
 public static void main(String[]args) {
	/*Print true if the given string (from SCanner ) contains a "bob"
	 * string, but where the middle 'o' char can be any char
	 * 'abcbob' -> bob is here
	 *  b9b-> bob is here
	 *  bac -> bob is not here
	 */
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter your word: ");
	 String word = sc.nextLine();
	 boolean flag = true;
	 
	 
	 for (int i= 0; i < word.length()-2; i++) {
		 // 1 < 3
		 if(String.valueOf(word.charAt(i)).equals("b") 
				 //
				 && word.charAt(i+2) == 'b') {
			 System.out.println("Bob is here");
			 break;
			 
		 }else {
			 System.out.println("Bob is not here"); 
		 }
			
	 }
  }
}

