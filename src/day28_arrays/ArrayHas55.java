package day28_arrays;

public class ArrayHas55 {

	public static void main(String[] args) {
		
		int  nums [] = { 45,15,52,5,5};
		
		//check if 5 and 5 are in positions next to one another;
		
		boolean found = false;
		
		for (int i =0; i < nums.length; i++) {
			if (nums [i] == 5 && nums [i+ 1] == 5) {
				found = true;
				break;
				//boolean check = false;
				//for (int i =0; i < nums.length()-1; i++){
				//int first = nums[i];
				//int second = nums [i+1];
				//if (first ==5 && second == 5){
				//check = true;
				//break;
			    //}
				//}
				//System.ot.pritnln(check);
			}
		}
		System.out.println(found);
		
		//nums[i+1]    -> if i is 1, we are making it 2 and reading index 2;
		//nums[i] + 1  -> read the value in the array and add 1 to it;
		//     5 +  1  -> 6

	}

}
