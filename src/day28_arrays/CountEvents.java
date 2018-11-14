package day28_arrays;

import java.util.Scanner;

public class CountEvents {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    
	    int counter = 0;
	    for (int i : nums) {
	    	if (i % 2 ==0) {
	    		counter++;
	    	}
	    }
	    System.out.println("Evens: " + counter);
	}

}
