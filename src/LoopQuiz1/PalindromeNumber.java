package LoopQuiz1;

import java.util.Scanner;

public class PalindromeNumber {
  public static void main(String[]args) {
	
	  /*
	   * write a java program which accepts a number from user and check 
	   * if number is palindrome or not
	   * a palindrome number is a number which remains the same 
	   * when it is reversed
	   */
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter the number: ");
	  int input = scan.nextInt();
	  int reverseNumber = 0;
	  
	  while(input != 0) {
		  int temp = input % 10;
		  reverseNumber = reverseNumber * 10 + temp;
		  input = input / 10;
		  System.out.println(input);
	  }
	  
	  if(input == reverseNumber) {
		  System.out.println("Number " + input + " is Palindrome" + reverseNumber);
	  }else {
		  System.out.println("Number " + input + " is not Palindrome" + reverseNumber);
	  }
	
	  
 }
}
