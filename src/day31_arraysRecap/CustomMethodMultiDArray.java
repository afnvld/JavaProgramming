package day31_arraysRecap;

public class CustomMethodMultiDArray {

	public static void main(String[] args) {
		int [][] numbers = { {1,2,3,4,5},{5,6,7,8,5},{5,6,7,8,7},{7,8,9,2,3}};
		int [][] numbers2 = { {8,6,4,5,5},{9,5,7,6,5},{7,4,3,2,1},	{8,2,3,4,3}};
		System.out.println("this is the first array given: ");
		printArrays(numbers);
	
		System.out.println("this is the sec array given");
		printArrays(numbers2);
	}
	
	public static void printArrays (int[][] nums) {
		for(int row =0; row < nums.length; row++) {
			for (int col =0; col < nums[row].length; col++) {
				System.out.print(nums[row][col] + "\t");
			}
	System.out.println();
	
	
}
	}
}

