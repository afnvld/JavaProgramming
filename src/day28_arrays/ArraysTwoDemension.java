package day28_arrays;

public class ArraysTwoDemension {

	public static void main(String[] args) {
		//declare arrays into arrays
		int [][] numbers = {{1,2,3}, {10,234,23,20,30}, {100,200,300}};
		System.out.println(numbers[1][3]);
		
		
		
		
		
		int [][]number= new int[3][];
		int [] ages = {26,25,50,100};
		//number[0] represents outer big box/array 
		//number[0]= new int[4];
		number[0]= ages;
		System.out.println(number[0][2]);
		
		//what if you want to store not oly schools, but students in it as well 
		//outer box schools and inner- students 
		
		//in order to run all-we'd use loops->inner, outer for loops
		//String[] school = new String [10];
		
		
	}

}
