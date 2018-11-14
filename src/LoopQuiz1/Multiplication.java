package LoopQuiz1;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// write a program which accepts an integer(N) and print its first 10 multiples
		//Each multiple should be printer on a new line in the from:N x i =result
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int n= scan.nextInt();
		
		for(int i=1; i<= 10; i++) {
			System.out.println(n + " * " + i+ " = "+ (i* n));
		}
		

	}

}
