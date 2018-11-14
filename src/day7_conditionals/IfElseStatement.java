package day7_conditionals;

public class IfElseStatement {
 public static void main(String[] args) {
	 
	 double coffeePrice = 5.50;
	 
	  if(coffeePrice < 6.0) {
			 System.out.println("I'll get coffee");
       }else {
  		 System.out.println("I'll not get coffee. Too expensive");

	  }
	  double accountBalance = 450.50;
	  double price = 700;
	  //if you have enough money, you buy the item
	  //otherwise you say not enough balance
	  
		 if(accountBalance >= price) { //price <= accountBalance
			  System.out.println("Let's buy!");
			  System.out.println("I'm ordering online");

		 }else {
			 System.out.println("Not enough balance, not buying.");
			  System.out.println("Let's do it another time!");

		 }
   /* 
 * 2 variables: speedlimit, currentSpeed
 * if currentSpeed is more than 20 mph compared to sppedLimit then
 * you are getting a speeding ticket, otherwise keep driving
 */
  
     // =-> assignment operator
     //== -> comparison operator; equals operator
	     int speedLimit, currentSpeed;
     speedLimit = 55;
     currentSpeed = 75;
     
     if(currentSpeed > speedLimit+20) {
		  System.out.println("Hey, slow down");
		  System.out.println("You are going to get a ticket");
		   }else {
				  System.out.println("Good job");
				  System.out.println("Keep driving");

		   }
    		 
		 
 }
}
