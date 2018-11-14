package ArrayAndMethodsTasks;

public class TwoDArrayTask2 {

	public static void main(String[] args) {
		int nums [][]= {{4,2,6,45,23,1},{22,34,66},{1,2,3}};
		twoDArray(nums);
	}
	
	public static void twoDArray (int [][] numbers) {
		int maxSum = 0;
		for (int j = 0; j<numbers.length; j++) {
			int temp = 0;
		 for(int i = 0; i < numbers[j].length; i++) {
			temp+= numbers[j][i];
			if (maxSum < temp) {
				maxSum= temp;
			}
			
			}
		}
		System.out.println(maxSum);
	}

}
