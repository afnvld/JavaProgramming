package homeWork;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		//1. Take values at index 0 and last index and swap them
		//2. Take values at index 0+1 and last index-1 and swap them
		//3. Keep repeating step 1 and 2 using a loop until you
		//reach the middle of the array (nums.length /2)
		int[] nums = {4, 3, 2, 44, 1, 100, 55};
		
		int temp = nums[0];
		for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
			if (i < nums.length / 2) {
				nums[i] = nums[j];
			} else {
				nums[j] = nums[i];
			}
		}
		
		System.out.println(Arrays.toString(nums));
	}

}
