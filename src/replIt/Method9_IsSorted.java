package replIt;

public class Method9_IsSorted {

	public static void main(String[] args) {
		int[] nums = { 2, 4, 5 };
		System.out.println(isSort(nums));
	}

	public static boolean isSort(int[] nums) {

		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i] > nums[i + 1]) {
				return false;
			} else {
				
			}
		}
		return true;

	}

}
