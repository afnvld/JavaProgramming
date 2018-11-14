package day29_arraysAndMEthods;

import java.util.Arrays;

public class CreateMethod2d {

	public static void main(String[] args) {
		int [][] myNumbers = {{23,23,34,56,34}, {1,2,3,4},{2,3,4,5,}, {2,34}};
		printDoubleArray(myNumbers);
	}
		public static void printDoubleArray(int [][] numbers) {
			 for(int i =0; i< numbers.length; i++) {
					System.out.println(Arrays.toString(numbers[i]));	
						 
		 }
			
				
		 
	 }
}
