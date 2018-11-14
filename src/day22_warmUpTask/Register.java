package day22_warmUpTask;

import java.util.Scanner;

public class Register {
 public static void main(String[]args) {
	 
	 Scanner scan = new Scanner(System.in);
	 System.out.println("How many items are you purchasing?");
	
	 int item = scan.nextInt();
	 double totalPrice = 0;
	
	 
	 for(int n =1; n <= item; n++ ) {
	        System.out.print("What is the item "+n+"?");
	        double price = scan.nextDouble();
	        totalPrice +=price;
	    }
	 String word = scan.next();
	 System.out.println("How much is "+word+"?");
	        
	       
			System.out.println("Your items: "+ word +", ");
	        System.out.println("Your total price: $"+totalPrice);
			
			
	 
 }
}
