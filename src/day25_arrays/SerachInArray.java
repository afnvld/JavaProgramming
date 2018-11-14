package day25_arrays;

public class SerachInArray {

	public static void main(String[] args) {
		//create array nums and assign 10 different numbers to it
		//search for a number 100 in it and using a loop,
		//once found print out index, location and "value found at index" + index 
		//once you find 100, then exit the loop at that point, we are looking for only first 100
		
		
		int [] nums = new int[] {1,2,3,4,5,6,7,8,9,100};
		int lookFor = 100;
		boolean found = false; //negative assumption
		
		for (int idx =0; idx< nums.length; idx++) {
			if (nums[idx]==lookFor) {
				System.out.println(lookFor + "was found at index " + idx);
				
				found = true;
				break;
		}
	}
			if(found == false) {
				System.out.println(lookFor + " not found");
				
	   }
	}
}