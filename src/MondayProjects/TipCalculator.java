package MondayProjects;

import java.util.Scanner;

public class TipCalculator {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Split or No split: ");
		String splitOrNot = scan.next();
		System.out.println("Number of people entered: ");
		int numOfPpl = scan.nextInt();
		System.out.println("Check amount: ");
		double checkAmount = scan.nextDouble();
		System.out.println("Service Quality: ");
		String serviceQuality = scan.next();


		double tip = 0;
		switch (serviceQuality) {
		case "Poor":
			tip = checkAmount * 0.05;
			break;
		case "Fair":
			tip = checkAmount * 0.10;
			break;
		case "Good":
			tip = checkAmount * 0.15;
			break;
		case "Great":
			tip = checkAmount * 0.20;
			break;
		case "Excellent":
			tip = checkAmount * 0.25;
			break;
		}
		
		if (splitOrNot.equals("yes")) {
			System.out.println("Split");
		}else{
			System.out.println("No split");
		}
		
		System.out.println("Number of people entered: ");
		for (int i = 0; i < numOfPpl + 1; i++) {
			System.out.print("&");
		}
		
		double totalToPay = checkAmount + tip;
		System.out.println();
		System.out.println("Total to pay: " + totalToPay);
		System.out.println("Total tip: " + tip);

		double totalPerPerson = totalToPay / numOfPpl;
		System.out.println("Total per person: " + totalPerPerson);
		
		double tipPerPerson = tip / numOfPpl;
		System.out.println("Tip per person: " + tipPerPerson);

	}
}