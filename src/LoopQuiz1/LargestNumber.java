package LoopQuiz1;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// write a Java program that reads in 3 numbers from the user in a loop (one at
		// a time)
		// and prints largest number and the summation of all numbers

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number 1:");
		int num1 = scan.nextInt();

		System.out.println("Enter number 2:");
		int num2 = scan.nextInt();

		System.out.println("Enter number 3:");
		int num3 = scan.nextInt();
		
		int sum = num1+num2+num3;

		int largest = 0;
			if (num1 > num2 && num1 > num3) {
				largest = num1;
			} else if (num2 > num3 && num2 > num1) {
				largest = num2;
			} else if (num3 > num2 && num3 > num1) {
				largest = num3;
			}
			System.out.println("Largest number = " + largest);
			System.out.println("Sum = " + sum );
		}


}
