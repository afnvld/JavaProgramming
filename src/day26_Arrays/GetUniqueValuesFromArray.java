package day26_Arrays;

public class GetUniqueValuesFromArray {

	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,4,2,3,4,44,12,20,100,33,100,4};
		
	//take a number from array 
	//compare with the rest of numbers in array, if no matches found
	//it is unique and print it out
		
	//take a number from array
	//create a variable counter and assign 0 to it. int counter =0;
	//compare the number with all other numbers(don't compare the number with itself)
	//if a match found counter++, if not dont touch counter
	//check if counter is still 0, if yes, print that number bc it is unique
		
	for(int outer = 0; outer< nums.length; outer++) {
		int currentNum = nums[outer];
		boolean unique = true;//duplicate = false;
	   
		for (int inner =0; inner < nums.length; inner ++) {
			if (nums [inner]== currentNum && outer != inner) {
				unique = false; //duplicate = true;
				break;
			}
		}
		if(unique) {//(duplicate == false) {
			System.out.println(currentNum + " ");

		}
		
	}
		
		

	}

}
