package homeWork;

import java.util.Arrays;

public class TreeArrayAssign10 {

	public static void main(String[] args) {
		int[] growth = new int[] {-1, 0, 1, 2, 1, 0, 2, 0, 2, 1}; // new int[10]
		/* Standard growth is 1 cm per year, if the tree is 3 yrs old or younger
		 * Otherwise, growth is 2 cm per year
		 * 
		 * Additional factors affecting growth are in growth array;
		 */
		
		
		
		for (int i =0; i < growth.length; i++) {
			if (i < 3) {
				growth[i] = 1;
			}else {
				growth[i]=2;
			}
		}
		for (int year =1; year<= growth.length; year++) {
			System.out.println("Year " + year + " growth " + growth[year -1] + " sm");
			
		}
	}

}
