package day4_operators;

import java.util.Scanner;

public class TemperatureConverter {
 public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a value in Farenheit");
			int farenheit = scan.nextInt();
			double celcius = (5.0 / 9) * (farenheit - 32);
			
	
	System.out.println("Temperature in Celcius: " + celcius);
	 
	 
 }
}
