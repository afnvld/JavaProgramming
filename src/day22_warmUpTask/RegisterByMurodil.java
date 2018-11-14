package day22_warmUpTask;

import java.util.Scanner;

public class RegisterByMurodil {
 public static void main(String[]args) {
	/*
	 * 
	 *  Mac' Command+shift+O is used for automatic import
	 *  Identation: select lines of code + tab --> to go back shift + tab
	 */
	  Scanner input = new Scanner(System.in);
	  System.out.println("----WELCOME TO OUR STORE---- :) \n");
		
		System.out.println("How many items you have?");
		int itemsCount = input.nextInt();
		
		//declare variables for all items and price for them
		String allItems = "";
		double totalPrice = 0;
		
		for(int i = 1; i <= itemsCount; i++) {
			System.out.println("What is item" + i +  "?");
			String item = input.next();
			
			System.out.println("How much is "+ item +"?");
			double price = input.nextDouble();
			if(i == itemsCount) {
				
				allItems = allItems + item;
			}else {
				allItems = allItems + item + ",";
			}
			
			totalPrice = totalPrice + price;
		}
		
		System.out.println("Your items: "+allItems);
		System.out.println("Total price: $" + totalPrice);
		
	}
}