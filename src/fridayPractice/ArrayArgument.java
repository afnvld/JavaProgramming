package fridayPractice;

import java.util.Arrays;

public class ArrayArgument {

	public static void main(String[] args) {
		// print 
		String [] names = {"james", "alan", "joe"};
		
	printArray(names);
	}	
		public static void printArray(String[] names) {
			for ( int i = 0; i <names.length; i ++) {
				
				System.out.println(names[i]);
			
			}
			

}
}