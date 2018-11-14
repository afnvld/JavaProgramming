package day25_arrays;

public class ArrayPrintReverse {

	public static void main(String[] args) {
		/*
		 * Create int arrays points and assign 10 different numbers 
		 * between 0 and 100
		 */
		int [] points = new int[] {1,2,3,4,5,6,7,8,9,10};
		//check if 10 points and say 10 points found
		if (points.length == 10) {
			System.out.println("10 points found");
		}else {
			System.out.println("We need 10 points");
		}
		/*1.using a for loop print each element/value/item in reverse order in same
		 * line separated by space
		 * 2. using a while loop print each item in reverse order in same line
		 * separated by space
		 */
//		for (int i =0; i<points.length; i++) {
//			System.out.print(points[i] + ",");
//		}
//		System.out.println();
//		//while loop
//		int i=0;
//		while (i<points.length) {
//			System.out.print(points[i] + ",");
//			i++;
//		}
		for (int i = points.length-1; i >= 0; i--) {
			System.out.print(points[i] + " ");	
		}
		System.out.println("\n----------WHILE LOOP---------");
		
		int idx = points.length - 1;
		
		while (idx >=0) {
			System.out.print(points[idx] + " ");
			idx--;
		}
	}

}
