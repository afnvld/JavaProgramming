package mentoringSession;

import java.util.Scanner;

public class ComparingThreeNumbers {

	public static void main(String[] args) {
		//Ask use to input three numbers
		//determine which is the greatest
		//Print out
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number 1: ");
		int num1 = input.nextInt();
		
		System.out.println("Enter number 2: ");
		int num2 = input.nextInt();
		
		System.out.println("Enter number 3: ");
		int num3 = input.nextInt();
		
		//try to see if the number 1 is greatest 
		if (num1 > num2 && num1 > num3) 
			System.out.println(num1);
		
		if(num2> num3 && num2 > num1)
			System.out.println(num2);
		
		if(num3> num2 && num3 > num1)
			System.out.println(num3);
		else 
				System.out.println("The numbers are equal");
		

	}

}
