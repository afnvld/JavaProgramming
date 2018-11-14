package fridayPractice;

public class More14 {

	public static void main(String[] args) {
		int[] nums = { 1, 4, 1 };
		System.out.println(more14(nums));
	}

	public static boolean more14(int[] nums) {
		int one = 0;
		int four = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				one++;
			}
			if (nums[i] == 4) {
				four++;
			}
		}
		if (one > four) {
			return true;
		} else {
			return false;
		}
	}

}
