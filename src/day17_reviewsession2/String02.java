package day17_reviewsession2;

import java.util.Scanner;

public class String02 {
 public static void main(String[]args) {
	 //create 1 string variable
	 //if 1st and last chars are same print "first
	 //if second and second from the last are the same 
	 //scanner with next() method
	 Scanner input = new Scanner(System.in);
	 System.out.println("What is the word?");
	 String word = input.next();
	 //test below conditions only if word has at least 4 chars
	 //if less than 4 chars -> say Error: at least 4 chars is req
	 if(word.length() >=4 ) {
	 //check first and last
	 if(word.charAt(0) == word.charAt(word.length()-1));{
	 System.out.println("Firsts same");
	 }
	 //check second and second from end
	 if(word.charAt(1)== word.charAt(word.length() - 2)) {
		 System.out.println("second Same");
		 
	 }
  }else {
	 System.out.println("ERROR: at least 4 chars required for this program");
 }
	 
	 
 }
}
