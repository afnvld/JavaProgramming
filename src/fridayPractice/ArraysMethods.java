package fridayPractice;

import java.util.Arrays;

public class ArraysMethods {

	public static void main(String[] args) {
		
		/*create an array nums 3,6,4,8,7
		 * find number 8
		 * print out
		 */

		int targetNumber = 6;
		int[] nums = {3,6,4,8,7};
	
	Arrays.sort(nums);
	System.out.println(Arrays.binarySearch(nums, targetNumber));//only works with search
	
		System.out.println(Arrays.toString(nums));
		
		System.out.println(CreatCustomMethods.name);
	}

}
