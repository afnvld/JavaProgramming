package day29_arraysAndMEthods;
import fridayPractice.Calculator_baias;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class JavaMethods {
	public static void main(String[]args) {
		
		System.out.println("This is amazon.com\n");
	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scan.nextLine();
	     sayHi(name); //invoke the method/ call
	     System.out.println("End of the program");
	}
 public static void sayHi(String name) {
	 System.out.println("hi");
	 System.out.println("Welcome " + name);
	 
//	 int [][] myNumbers = {{23,23,34,56,34}, {1,2,3,4},{2,3,4,5,}, {2,34}};
//		printDoubleArray(myNumbers);
	 int [] nums = {23,23,34,43,543,43,1};
	 myToString(nums);
	
	}
//replicate Arrays.toString method
 //create a method that takes array and print out value in format of [el1,el2..]
 public static void myToString (int[] nums) {
	 String result = "[";
	 for (int i=0; i < nums.length; i++) {
		 if (i == nums.length-1) {
			 result += nums[i] + "]";
		 }else {
			 result += nums[i] + ",";
			 
		 }
	 }

	 System.out.println(result);
 }
	 
		public static void printDoubleArray(int [][] numbers) {
			 for(int i =0; i< numbers.length; i++) {
					System.out.println(Arrays.toString(numbers[i]));	
			 }			 
		 }
			
		
 }

