package day28_arrays;

import java.util.Arrays;

public class ArraysToString {

	public static void main(String[] args) {
		//toString method is present in all java classes, and it is used to describe
		// the object
		
		int[] nums = {7,32,5,23};
		System.out.println(Arrays.toString(nums));
		
//binarySearch method. It will return index of a specified element in the array
		
	String [] words = { "cake", "tomato", "wooden spoon", "pizza"};
	// first of all sort the array =============Arrays.sort(words);
	Arrays.sort(words);
	// print all in one line:
	System.out.println(Arrays.toString(words));
	//find the index of pizza in the words array
	System.out.println(Arrays.binarySearch(words, "pizza"));
	
	}

}
