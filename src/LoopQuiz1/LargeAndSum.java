package LoopQuiz1;

import java.util.Scanner;

public class LargeAndSum {
	public static void main(String[] args) {
		/*
		 * Write a Java program 
		 * that reads in 3 numbers from the user in a loop (one at a time) 
		 * And prints largest number and the summation of all numbers 
		 */
		Scanner scan = new Scanner(System.in);
		int largestNumber = 0;
		int sum =0;
		int n=1;
		while(n != 4) {
			System.out.print("Enter number "+n+" : ");
			int number = scan.nextInt();
			sum += number;
			n++;
			if(number > largestNumber ) {
				largestNumber=number;
			}
		}
	    System.out.println("Sum of numbers = "+sum);
		System.out.println("Largest number = "+largestNumber);
		
	}
}