package replIt;

import java.util.ArrayList;

public class ArrayListMult {

	public static void main(String[] args) {
		ArrayList<Integer> numms = new ArrayList<>();
		numms.add(5);
		numms.add(6);
		timesTwo(numms);

	}

	public static void timesTwo(ArrayList<Integer> nums) {

		for (int i = 0; i < nums.size(); i++) {
			nums.set(i, nums.get(i) * 2);
		}
		System.out.println(nums);
	}

}
