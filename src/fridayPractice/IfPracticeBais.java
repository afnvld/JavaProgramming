package fridayPractice;

import java.util.Arrays;
import java.util.Scanner;


public class IfPracticeBais {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner (System.in);
//		System.out.println("Please enter a number: ");
//		int size = scan.nextInt();
//		
//		String[] arr = new String[size];
//		
//		for(int i =0; i < arr.length; i++) {
//			arr[i]= i + " ";
//			System.out.println(arr[i]);
//		}
//		for(String each: arr) {
//			each =  " ";
//		}
//	
		
		String [] arr = {"baias", "adina", "nurlan", "lala"};
		String reverse = "";
		
		for (int i = arr.length-1; i >= 0; i--) {
			reverse += arr[i] + " ";
		}
		String temp ="";
		for(int i =0, j = arr.length-1; i<arr.length/2; i ++, j--) {
			temp = arr[i];
			arr[i]= arr[j];
			arr[j]= temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}
		
		
		
		
	}


