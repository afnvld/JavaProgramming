package day31_arraysRecap;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysCars {

	public static void main(String[] args) {

		//String [] carBrands = {"mercedes", "bmw", "toyota", "ferrari"};
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of cars: ");
		int number = scan.nextInt();
		String [] carBrands = new String[number];
		
		for(int i =0; i< carBrands.length;i++) {
		
		System.out.println("Please enter car: ");
		carBrands[i]= scan.next();
		}
		
		
		System.out.println("Enter a car name");
		String carName = scan.next();
	for(int i =0; i< carBrands.length;i++) {
		if (carBrands[i]== carName) {
			System.out.println(carName + ": Luxury-Comfort");
			break;
			
		} else if (carBrands[i]==carName) {
			System.out.println(carName + ": Luxury-sport");
			break;
		
		} else if (carBrands[i]== carName) {
			System.out.println(carName + ": Reliable cheap");
			break;
			
		} else {
			System.out.println(carName + ": Super car-super expensive");
			break;
			
		}
	}
		
	}
}


