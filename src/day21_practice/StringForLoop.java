package day21_practice;

import java.util.Scanner;

public class StringForLoop {
 public static void main(String[]args) {
	/*int counter=0;
apples
p
1. loop though each character and compare if it is matching "p"
if yes, counter++
word.charAt(index)+"".equals("p")
	counter++
word.charAt(index) == 'p';

after going through each character then print
value of counter
=================
How to accept a single char using scanner:
char ch = input.next().charAt(0);
===========================*/
	 String str = "apples";
	 //            012345
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter the word: ");
	 String input = scan.nextLine();
	 char ch = 'p';
	 int counter = 0;
	 for(int i = 0; i < input.length(); i++) {
		 if(input.charAt(i) == ch) {
			 counter++;
		 }
	 } 
	 System.out.println("Number of 'p' letter: " + counter);


/*1. Palindrome:
   it means it reads the same from right to left and left to right.

   String word = "civic";
   String reversed = "";

   reverse the word and assign each character to reversed string.

   if(word.equals(reversed)) {
   		print "Palindrome"
   }else{
   		print "Not palindrome"
   }
   

3.  Accept a String and print only unique characters in the String:

String word = "mama";
String unique = "";

charAt , contains
substring, contains

if(!unique.contains("m") ){
	unique+="m";
	unique = unique + "m";
}
	 * 
	 *  
	 */
	 
	 
	 
	
	 
 }
}
