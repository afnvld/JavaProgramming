package day31_arraysRecap;

import java.util.Arrays;
import java.util.Scanner;

public class DivideMyArray {

	public static void main(String[] args) {
		
		System.out.println("Welcome to DIVIDE MY ARRAY");
		System.out.println("Enter a number that will be the size of your array: ");
		
		Scanner scan = new Scanner(System.in);
		int sizeOfArray = scan.nextInt();
		
		int[] numbers = new int[sizeOfArray];
		for (int i =0; i < sizeOfArray; i++) {
			numbers [i] = scan.nextInt();
		}
 System.out.println("The string value of your array: "+ Arrays.toString(numbers));
 int[] firstHalf = Arrays.copyOfRange(numbers,0, numbers.length/2);
 int[] secondHalf = Arrays.copyOfRange(numbers, numbers.length/2, numbers.length);
 System.out.println("The first half of arr: "+ Arrays.toString(firstHalf));
 System.out.println("The second half of arr: "+ Arrays.toString(secondHalf));
	
		
	}

}
