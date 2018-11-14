package day10_conditionals4;

import java.util.Scanner;

public class FindASeason {
 public static void main(String [] args) {
	 /* 1. Find a season.
	  * month---> number and find the season of the year for that month number
	  * 2. Leap year: (feb 29)
	  *  if an year is multiple of 400 or multiple of 4 but not multiple of 100 then its leap year
	  */
	 Scanner scan = new Scanner(System.in);
	 
	 int month = 2; //use scanner for this
	 //spring -->3-5; summer-6-8; fall--> 9-11; winter, 12,1-2;
	 
	 if(month == 12 || month == 1 || month == 2) {
		 System.out.println("Winter");
	 }else if(month >= 3 && month <= 5) {
		 System.out.println("Spring"); 
	 }else if(month >= 6 && month <= 8) {
		 System.out.println("Summer");
	 }else if(month >= 9 && month <= 11) {
		 System.out.println("Fall");
	 }else {
		 System.out.println("invalid month. 1-12accepted ");
	 }
	 
	 
	 
 }
}
