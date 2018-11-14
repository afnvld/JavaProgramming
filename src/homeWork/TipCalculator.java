package homeWork;

import java.util.Scanner;

public class TipCalculator {
		public static void main(String[]args) {
	// Start Scanner
	Scanner input = new Scanner(System.in);

				// Get user inputs
				// Split
				System.out.println("Split?: Type 1 for Yes OR Type 2 for NO");
				int split = input.nextInt();
				
				if (split < 1 || split > 2) {
					System.out.println("Wrong input!");
					System.exit(0);
				}
				
				boolean splitBoolean = false;
				
				if (split == 1) {
					splitBoolean = true;
				}

				// Number of people
				System.out.println("Enter the number of people: ");
				int numberOfPeople = input.nextInt();
				
				if (numberOfPeople < 1) {
					System.out.println("Wrong input!");
					System.exit(0);
				}
				
				// Check amount
				System.out.println("Enter the check amount: ");
				double checkAmount = input.nextDouble();
				
				if (checkAmount <= 0) {
					System.out.println("Wrong input!");
					System.exit(0);
				}
				
				// Service quality
				System.out.println("Choose service quality: ");
				System.out.println("1) Poor");
				System.out.println("2) Fair");
				System.out.println("3) Good");
				System.out.println("4) Great");
				System.out.println("5) Excellent");
				int serviceQuality = input.nextInt();

				// Initialize tip percentage
				double tipPercentage = 0;
				
				//Set the tip percentage
				switch (serviceQuality) {
				case 1:
					tipPercentage = 0.05;
					break;
				case 2:
					tipPercentage = 0.10;
					break;
				case 3:
					tipPercentage = 0.15;
					break;
				case 4:
					tipPercentage = 0.20;
					break;
				case 5:
					tipPercentage = 0.25;
					break;
				default:
					System.out.println("Wrong input");
					System.exit(0);
					break;
				}
				
				//Calculate tip amount
				double tipAmount = checkAmount * tipPercentage;
				
				//Show results to the user
				//Split
				System.out.print("Split: ");
				if (splitBoolean) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
				
				System.out.println("Number of people: " + numberOfPeople);
				System.out.println("Check amount: " + checkAmount);
				
				System.out.print("Service quality: ");
				switch (serviceQuality) {
				case 1:
					System.out.println("Poor");
					break;
				case 2:
					System.out.println("Fair");
					break;
				case 3:
					System.out.println("Good");
					break;
				case 4:
					System.out.println("Great");
					break;
				case 5:
					System.out.println("Excellent");
					break;
				}
				
				if (splitBoolean) {
					System.out.println("Total per person: " + checkAmount / numberOfPeople);
				}
				
				System.out.println("Total tip amount: " + tipAmount);
				
				if (splitBoolean) {
					System.out.println("Total tip per person: " + tipAmount / numberOfPeople);
				}
				
				input.close();
			}
		}
	

