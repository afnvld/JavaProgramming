package MondayProjectsOctober1;

import java.util.Scanner;

public class LoopsMonday02_2 {
 public static void main(String[]args) {
	//Write a program to prompt the user to enter the numbers till the user wants 
	//(by asking user if he wants to continue) and at the end it should display the count
	//of positive, negative and zeros entered. 
    int num = 0;
	int a = -999999999;
	int b = 999999999;
	String yesOrNo = "", yes = "yes", no = "no";

	Scanner scan = new Scanner(System.in);
	while (true) {
		System.out.println("Please enter a number: ");
		num = scan.nextInt();

		System.out.println("Do you want to continue? yes/no");
		yesOrNo = scan.next().toLowerCase();
		while (!(yesOrNo.equals(yes) || yesOrNo.equals(no))) {
			System.out.println("Wrong entry. Please try again. \n Do you want to continue? yes/no");
			yesOrNo = scan.next();
		}

		if (num > a) {
			a = num;
			
		}
		if (num < b) {
			b = num;
			
		}

		if (yesOrNo.equals(no))
			break;
	}

		System.out.println("Largest is: " + a);
		System.out.println("Smallest is : " + b);
	}
}