package MondayProjectsOctober1;

import java.util.Scanner;

public class LoopsMonday02 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter any positive number:");
		int n1 = input.nextInt();
		if (n1 > 0) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(n1 + " * " + i + " = " + n1 * i);
			}
		}

		
		
	}
}