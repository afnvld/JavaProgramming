package day9_conditionals3;

public class RushHourTollCalculator {
 public static void main(String[] args) {
	 
	 /*Normal hours:
	  * 0-100-> $5
	  * 101-500 --> $8
	  * 501-1000 --> $10
	  * More than 1000--> $12
	  * 
	  * RUSH HOURS:
	  * 0-100-> $10
	  * 101-500-> $17
	  * 501-1000-> $20
	  * More than 1000-->$24
	  */
	 
	 boolean isRushHour = true;
	 int miles = 25;
	 double tollCost = 0.0;
	 if(miles > 0 && miles <= 100) {
		  if (isRushHour == true) {
			  tollCost = 10.0;
		  }else {
			  tollCost = 5.0;
		  }  
	}else if(miles > 101 && miles <= 500) {
			  if (isRushHour == true) {
				  tollCost =17.0;
			  }else {
				  tollCost = 8.0;
			  }	  
	}else if(miles > 501 && miles <= 1000) {
		  if (isRushHour == true) {
			  tollCost = 20.0;
		  }else {
			  tollCost = 10.0;
		  }
     }else if(miles >= 1000) {
    	 if (isRushHour == true) {
    		 tollCost = 24.0;
    	 }else {
    		 tollCost = 12.0;
    	 }
     
     }	  
	 
	 System.out.println("Toll Cost: " + tollCost );
 }
 }
 
