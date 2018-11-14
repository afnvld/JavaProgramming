package mentoringSession;

import java.util.Arrays;

public class findSecondHighestNum {

	public static void main(String[] args) {
		
		int []array = {2,4,34,5,3};
		System.out.println(findSecondValue(array));
		

	}
	
	
	public static int findSecondValue (int[]array) {
		int largest = 0;
		int secondLargest=0;
		for(int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				largest = array[i];
			if(largest> array[i]) {
				secondLargest=array[i];
			}
			}
			
			
		}
			System.out.println(largest);
			return largest;
		
		//Arrays.sort(array);
		
	}

}
