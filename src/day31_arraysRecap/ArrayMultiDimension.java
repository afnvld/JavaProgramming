package day31_arraysRecap;

public class ArrayMultiDimension {

	public static void main(String[] args) {
		
		int [][] numbers = { {1,2,3,4,5},
							 {5,6,7,8,5},
							 {5,6,7,8,7},	
							 {7,8,9,2,3}
							};
		for(int row =0; row < numbers.length; row++) {
			for (int col =0; col < numbers[row].length; col++) {
				System.out.print(numbers[row][col] + "\t");
			}
			System.out.println("");
		}
		multiDMethod(numbers, 8, 9 );
	}
	
	
	
		public static void multiDMethod (int [][] nums, int row, int col) {
			
		System.out.println("the element at the row: " + row + "the coulmn: "  + col 
				+ "num itself" + nums[row][col]);
		
			}
		}
		

	


