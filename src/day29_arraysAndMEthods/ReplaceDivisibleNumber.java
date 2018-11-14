package day29_arraysAndMEthods;

import java.util.Arrays;

public class ReplaceDivisibleNumber {

	public static void main(String[] args) {
	//replace with 10 if number is not divisible by 10;
	// if divisible by 10 then skip and change the value of replacement num to this value
		
		int[] nums = {4,5,10,3,20,14,15};
		int replacement = 10;
		System.out.println(Arrays.toString(nums));

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 10 != 0) {
				nums[i] = replacement;
			}else {
				replacement = nums[i];
	}
		
		}
		System.out.println(Arrays.toString(nums));
	}

}
