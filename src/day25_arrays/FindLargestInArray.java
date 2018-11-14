package day25_arrays;

import java.util.Scanner;

public class FindLargestInArray {

	public static void main(String[] args) {
		// ask user to enter how many items in array
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many items in array?");
		int count = input.nextInt();
		
		//create array called nums with that capacity
		int nums[]= new int [count];
		
		//using a loop enter values one by one
		for (int i=0; i < count; i++ ) {
			System.out.println("Enter number");
			nums[i]= input.nextInt();
			
		}
		//print all items in same line using for each loop
		for(int n: nums) {
			System.out.print(n+ " ");
			
		}
		System.out.println();
		
		//iterate in array and find the largest value
		 int largest = nums[0]; //assume that first one is largest
		 //loop through the rest and check if they are greater than value of largest
		 //if true--> assign that value to largest
		 //print out "Largest: " + largest outside the loop
		 
		 for(int num : nums) {
			 if(num > largest) {
				 largest=num;
			 }
		 }
		 System.out.println("Largest: " + largest);
		 
		 
		 
		 
		 

	}

}
