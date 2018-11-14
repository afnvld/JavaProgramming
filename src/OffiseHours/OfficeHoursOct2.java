package OffiseHours;

import java.util.Scanner;

public class OfficeHoursOct2 {
 public static void main(String[]args) {
	 
	 /*Write a program that prompts user to 
	  * enter to enter the numbers till the user wants 
	  * (by asking if user wants to continue) and at
	  * the end the program should display the largest and 
	  * smallest numbers entered
	  */
	boolean b = true;
	Scanner input = new Scanner(System.in);
	String userInput = "";
	int userNumber =0;
	int currentHighestNumber = 0;
	do {
		System.out.println("Enter a number: ");
         userInput = input.next();//4
 		System.out.println("Do you want to enter more numbers? ");
             userInput = input.next();
         if(userInput.equalsIgnoreCase("no")){
        	 b = false;
      }
         //current Highest Number = Math.max(userNumber, currentHighestNumber);
      if(userNumber > currentHighestNumber) {//if user entry is higher > true
    	  currentHighestNumber = userNumber;
    	  
         }
	}while(b);//always true unless line 25
	
	 System.out.println("current highest number = " + currentHighestNumber);
	 
 }
}
