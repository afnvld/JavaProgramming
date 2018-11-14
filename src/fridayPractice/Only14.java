package fridayPractice;

public class Only14 {

	public static void main(String[] args) {
		int[] nums = {1,4,1,4};
		System.out.println(only14(nums));
	}
	
	public static boolean only14(int[] nums) {
		for(int n : nums) {
		  if (n!=1 && n!=4) {
			  return false;
         }
		}
		return true;
		
	}
}
		
		
	