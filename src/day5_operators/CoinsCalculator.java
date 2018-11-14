package day5_operators;

import java.util.Scanner;

public class CoinsCalculator {
 public static void main(String[] args ) {
//	 int pennies = 250;
//	 int dollars = pennies / 100;
//	 System.out.println( dollars);
//	pennies %= 100;
//	System.out.println("Remaning pennies:" + pennies);
  Scanner keyboard = new Scanner (System.in);
  System.out.println("Enter count of pennies you have:");
	int pennies = keyboard.nextInt();
	int dollars, quarters, dimes, nickels, cents;
	
	dollars = pennies / 100;
	pennies %= 100;
	
	quarters = pennies / 25;
	pennies %= 25;
	
	dimes = pennies / 10;
	dimes %= 10;
	
	nickels = pennies / 5;
	pennies %= 5;
	
	cents = pennies;
	
	System.out.println("Dollars: " + dollars);
	System.out.println("Quarters: " + quarters);
	System.out.println("Dimes: "  + dimes);
	System.out.println("Nickels: " + nickels);
	System.out.println("Cents: " + cents);
 }
}
