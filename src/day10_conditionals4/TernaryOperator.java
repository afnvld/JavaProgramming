package day10_conditionals4;

public class TernaryOperator {
 public static void main(String[] args) {
	 int score = 70;
	 String status;
	 /*
	  * 1 do using if else
	  */
	 if(score >= 60) {
		 status = "pass";
	 }else {
		 status = "fail";
	 }
	 /*
	  * 2 Using ? (ternary operator)
	  */
	// status = (score >= 60) ? "pass" "fail";
	 System.out.println(status);
	 /* 
	  * boolean variable express
	  * if true --> shipiing = $25
	  * if false --> shipping = $15
	  */
	 boolean express = true;
	 System.out.println((express) ? 25 : 15);
	 int shipping = (express) ? 25 : 15;
	 System.out.println(shipping);
	 
 }
}
