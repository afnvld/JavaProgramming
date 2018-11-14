package day22_warmUpTask;

public class NestedLoopExample {
 public static void main(String[]args) {
	 //nested loop is loop inside of loop 
	 //outer loop and inner/nested loop
	 
	 //write a program that prints numbers from 1 to 10 in same line
	 //separated by space. FOR LOOP
	 //add one more for loop and put everything from line 14-17, needs to loop 5 times
	 
	 for (int j=1; j<=3; j++) {
	 
	 for(int i =1;i<=10; i++) {
         System.out.print(i+" ");
     }
	 System.out.println();
	 }
	 
	 System.out.println("outside loop");
	 //modify nested loops above so that it print this pattern:
	 for (int j=1; j<=10; j++) { // j=1,2,3
		 
		 for(int i =1;i<=j; i++) {//i=1,2,3,4,5,6,7,8,9,10
	         System.out.print(i+" ");
	     }
		 System.out.println();
		 }
		 
		 System.out.println("outside loop");
	 /*12345678910
	  * 123456789
	  * 12345678
	  */
		for (int outer = 10; outer >= 1; outer--) {
			for (int inner = 1; inner <= outer; inner++) {
				System.out.print(inner+ "");
				
			}
		}

	 //the opposite
		/*
		 * 12345678910
		 * 123456789
		 * 12345678
		 * 1234567
		 * 123456
		 * 12345
		 * 1234
		 * 123
		 * 12
		 * 1
		 */
		for(int outer = 10; outer >= 1; outer--) {
			for(int inner = 1; inner <= outer; inner++) {
				System.out.print(inner+" ");
			}
			System.out.println();
		}
		
		
 }
}
