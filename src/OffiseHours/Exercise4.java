package OffiseHours;

import java.util.Scanner;

public class Exercise4 {
 public static void main(String[]args) {
	 
	 Scanner scan = new Scanner(System.in);
	 
	 System.out.println("Please enter an integer: ");
	 int num = scan.nextInt();
	 
	 if(num < 0 || num % 10 == 0) {
		 
		 System.out.println("The number is not a palindrome: ");
         System.exit(0);
	 }
	 
	 
	 int copy = num; //12345
	 int reverse = 0;
	 while(copy > 0 ) {
		//Multiply the reversed int by 10
		 reverse *= 10;
		 
		 // Extract last digit
		 //Add this digit to a reversed int
		 reverse += copy % 10;
		 
		 //delete this last integer from copy
		 copy = copy / 10;
		 
	 }
	 
	 if(num == reverse) {
		 System.out.println("The number is a palindrome");
	 }else
		 System.out.println("The number is NOT a palindrome");

 }
}
