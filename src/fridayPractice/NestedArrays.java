package fridayPractice;
import java.util.Arrays;
public class NestedArrays {

	public static void main(String[] args) {
		int[][] numbers = {{1,2,3,},{5,6,7},{8,9,10}};
		
		for (int parentArray = 0; parentArray < numbers.length; parentArray++) {
			System.out.println("Parent Array " + parentArray+" ");
			                                            //if not parentArray out of bound
			for (int childArray = 0; childArray < numbers[parentArray].length; childArray++) {
				System.out.println(numbers[parentArray][childArray] + "\t");
			}
			System.out.println("");
		}
	}

}
