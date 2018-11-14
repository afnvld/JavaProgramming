package fridayPractice;

import java.util.Arrays;

public class Sum28 {

	public static void main(String[] args) {

		int[] nums = { 2, 3, 2, 2, 4, 2 };
		System.out.println(sum28(nums));

	}

	public static boolean sum28(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2) {
				sum += nums[i];
			}
		}
		if (sum == 8) {
			return true;
		}else {
			return false;
		}
	}

}
