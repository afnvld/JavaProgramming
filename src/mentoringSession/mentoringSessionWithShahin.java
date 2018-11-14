package mentoringSession;

import java.util.Scanner; //util.*

public class mentoringSessionWithShahin {
     public static void main(String[] args) {
	 
/* IF STATEMENTS
 * Ask user to input numbers
 * Write if conditions to determine if the # is a) positive, b) negative or c) zero
 * Print out	 
 */
	 
   Scanner input = new Scanner(System.in);
   System.out.println("Enter the numbers: ");
   //shift +enter = to nextln
   int num = input.nextInt();
   
   if (num  > 0) {
	   System.out.println("This number is positive.");
   }else if (num < 0) {
	   System.out.println("This number is negative.");
   }else{
	   System.out.println("The number you entered is zero.");
   }
	   
//   if (num > 0) 
//	   System.out.println("Positive");
//   
//   if (num < 0)
//	   System.out.println("Negative");
//   
//   if (num == 0)
//	   System.out.println("Zero");
//   
//    	
//    	
    	 
    	 
 }
 
}
