package day_33_methods;

import java.util.Arrays;
import java.util.Scanner;

public class AssignmentOne {

	public static void main(String[] args) {
		int [] arr = {23,24,5,6,7};
		int [] newArray = initializeElements(arr,10);
		System.out.println("Printing out from main after ctching");
		System.out.println(Arrays.toString(newArray));
//		sayHello();

	}
	
//	
//	public static void sayHello() {
//		System.out.println("Hello World");
//	}
//	
	
	
	public static int[] initializeElements (int[] nums, int target) {
		System.out.println(Arrays.toString(nums));
		System.out.println("Target: " + target);
		for(int i=0 ;i<nums.length;i++){
			nums[i]= target;
		}
		System.out.println("After the loop");
		System.out.println(Arrays.toString(nums));
		return nums;
		}
	
		
	
	
	
	}


