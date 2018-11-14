package replIt;

public class FindNonDublicate2 {

	public static void main(String[] args) {
		int []nums = {1, 1, 2, 3, 4, 3, 4};
		int count =0;
		for(int k =0; k< nums.length; k++) {
			for(int j =0; j<nums.length; j++) {
				if(nums[k]==nums[j]) {
					count++;	
					}
				}
				if(count ==1) {
					System.out.println(nums[k]);
				}
				count=0;
			}
	}

}
