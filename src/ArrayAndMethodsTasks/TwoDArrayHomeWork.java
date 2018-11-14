package ArrayAndMethodsTasks;

public class TwoDArrayHomeWork {

	public static void main(String[] args) {
		//create a void method that accepts twoD array and prints out the biggest integer element
		int [][] nums = {{4,2,6,45,23,1}, {22,34,66},{1,2,3}};
		findBiggestInteger(nums);	
		}
	public static void findBiggestInteger (int [][] numbers) {
		int largest = numbers[0][0];
		for (int i = 0; i <numbers.length; i++) {
				for(int j = 0; j < numbers[i].length; j++) {
					if (numbers[i][j] > largest) {
						largest = numbers[i][j];
					}
					
				}
		}
		System.out.println(largest);
		
	}

}
