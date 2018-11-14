package day26_Arrays;

public class IncrementArrayValues {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5,6,7,8,9};
		for (int i =0; i< nums.length; i++) {
			System.out.print(nums[i] + " ");
		}System.out.println();
		
		
		for (int idx =0; idx< nums.length; idx++) {
			if(nums[idx] %2==1) {
				System.out.print(3 *nums[idx] + " ");
			}else if ((nums[idx] %2 ==0)) {
				System.out.print(2 * nums[idx] + " ");
			}
	}
     
	 //ternary nums[i] = (nums[i] % 2 ==0) ? nums[i] *2 : nums[i] *3; 
	 //USING FOR EACH LOOP:
     //   int nums[]= {1,2,3,4,5,6,7,8,9};
		System.out.println();
        for(int n:nums) {
            System.out.print(n+" ");
            } System.out.println();
        for(int a:nums) {
            if(a%2==0) {
                System.out.print(a*2+" ");
            } else if (a%2==1)
                System.out.print(a*3+" ");
        }
		
		
		
		
	}
}

