package day11_programming;


	 import java.util.Scanner;

	 public class CheckClass {
	 	/*
	 	 *  Warm up task:
	 		Write a program called CheckClass
	 		We have a day with a number in it
	 		and we check what day it is
	 		String classAtSchool = "Group Project"
	 		String WeekdayName = "Monday";
	 		day 1 -> classAtSchool = "Group Project"
	 				WeekdayName = "Monday"
	 		
	 		day 2 -> classAtSchool = "Java"
	 				WeekdayName = "Tuesday"
	 		....
	 		Print message -> It is Tuesday and Java class
	 	 */
	 	public static void main(String[] args) {
	 		Scanner scan = new Scanner(System.in);
	 		System.out.println("Enter Day:");
	 		int day = scan.nextInt();
	 		
	 		String classAtSchool = "", weekdayName = "";
	 		
	 		if(day == 1) {
	 			classAtSchool = "Group Project";
	 			weekdayName = "Monday";
	 		}else if(day == 2) {
	 			classAtSchool = "Java programming";
	 			weekdayName = "Tuesday";
	 		}else if(day == 3) {
	 			classAtSchool = "Java programming";
	 			weekdayName = "Wednesday";
	 		}else if(day == 4) {
	 			classAtSchool = "Manual QA/SDLC/Softskills";
	 			weekdayName = "Thursday";
	 		}else if(day == 5) {
	 			classAtSchool = "No class";
	 			weekdayName = "Friday";
	 		}else if(day == 6) {
	 			classAtSchool = "Java programming";
	 			weekdayName = "Saturday";
	 		}else if(day == 7) {
	 			classAtSchool = "Java programming";
	 			weekdayName = "Sunday";
	 		}else {
	 			System.out.println("ERROR: Invalid Day");
	 		}
	 		
	 		System.out.println("Day of Week: " + weekdayName +"\n"+
	 							"Class: " + classAtSchool);
	 		
	 	}
	 	
	 	
	 	
	 }
	

