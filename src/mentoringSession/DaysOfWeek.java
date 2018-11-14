package mentoringSession;

import java.util.Scanner;

public class DaysOfWeek {
 public static void main(String[]args) {
	 
	 /*Ask user to input a number of the day
	  * Print out which day it is
	  * 
	  * if wrong day, print out "Invalid day range"
	  */
	 
	 Scanner input = new Scanner(System.in);
	 //ask user to input a number
		System.out.println("Please enter number of the day");
			
	//store a number
	int numberOfTheDay = input.nextInt();
	
	
	//store the day names in some kind of variable
	String nameOfTheDay ="";
	
	//define which number is going to represent day
	switch(numberOfTheDay) {
	
	// check for numberofTheDay == 1 condition
	 case 1: 
		 nameOfTheDay = "Monday";
	     break;
     // check for numberofTheDay == 2 condition
	 case 2: 
		 nameOfTheDay = "Tuesday";
		 break;
	 case 3: 
		 nameOfTheDay = "Wednesday";
		 break;
	 case 4: 
		 nameOfTheDay = "Thursday";
		 break;
	 case 5: 
		 nameOfTheDay = "Friday";
		 break;
	 case 6: 
		 nameOfTheDay = "Saturday";
		 break;
	 case 7: 
		 nameOfTheDay = "Sunday";
		 break;
		 default:
			 nameOfTheDay = "Invalid day";
			 break;
			 
	}
//	if(numberOfTheDay <1 && numberOfTheDay >7) {
//	System.out.println("invalid day range.");
//	}else {
//		if (numberOfTheDay == 1) {
//		nameOfTheDay = "Monday";
//		}else if (numberOfTheDay ==2) {
//			nameOfTheDay = "Tuesday";	
//		}
	//}
	
	
	
	
	System.out.print("It is " + nameOfTheDay);
	
	//if wrong day, I will print "invalid day"
//	if(numberOfTheDay <1 || numberOfTheDay >7) {
//		System.out.println("invalid day range.");
//	}
 }
}
