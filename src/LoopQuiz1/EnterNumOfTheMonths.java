package LoopQuiz1;

import java.util.Scanner;

public class EnterNumOfTheMonths {

	public static void main(String[] args) {
		// Write a Java program which repeatedly ask the user to enter 
		//the number of the months (1 to 12). 
		//If the user enters an incorrect number, Program terminates.

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number: ");
        int number = scan.nextInt();
        int number2 = scan.nextInt();
        do {
        	System.out.println("Please enter another: ");
        }while(number >=12);
       // int number2 = scan.nextInt();
		
		
	}

}
