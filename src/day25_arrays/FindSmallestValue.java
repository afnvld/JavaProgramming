package day25_arrays;

public class FindSmallestValue {

	public static void main(String[] args) {
		/* create array nums and assign several values 
		 * print the smallest value in array
		 */
		
		int nums[]= {20, 3, 0, -4, 40, 50};
		 int smallest = nums[0];
		 
		 for (int n : nums) {
			 if(n < smallest) {
				 smallest = n;
			 }
			 //smallest = n < smallest ? n: smallest; //----> ternary
		 }
		 System.out.println(smallest);
		
		
		
		
	}

}
