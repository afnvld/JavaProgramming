package replIt;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int [] nums = {4, 3, 2, 44, 1, 100, 55};
		
		for (int i =0; i < nums.length/2; i++) {
			int temp3 = nums[i];
			nums[i] = nums[nums.length - (i +1)];
			nums[nums.length - (i +1)] = temp3;
		}
		System.out.println(Arrays.toString(nums));
	}

}
