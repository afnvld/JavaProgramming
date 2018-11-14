package OffiseHours;

import java.util.Scanner;

public class LoopExercise1 {
public static void main(String[]args) {
	//create a scanner
	Scanner input = new Scanner(System.in);
	
	int largest = -1;
	int sum = 0;
	
	for(int i = 1; i < 4; i++) {
		
		System.out.println("Enter a number: ");
		int temp = input.nextInt();
		
	//Add the temp to sum
	sum += temp;
		
	if (temp > largest) {
			largest = temp;
			
		}
	
	}
	//return the largest input
	System.out.println("Sum is " + sum);
	System.out.println("Largest integer is: " + largest);

	
	
}
}
