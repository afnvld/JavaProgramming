package day8_conditionals2;

import java.util.Scanner;

public class WarmUpTasks {
 public static void main(String[] args) {
	 
	 /*
	  * write a program that asks a student what is their Batch number 
	  * if that is 10, say we are classmates!
	  * if not, say something else
	  */
	 
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("What is your Batch number?");
	 int batch = scanner.nextInt();

	 if (batch == 10) {
		 System.out.println("We are classmates!");
	 }else {
		 System.out.println("Oh, I see!");

	 }
 

       /*Create a variable pincode and assign some number
        * Ask used to enter their pincode, if it matches , say access granted
        * if not, denied
        */

           int pincode = 1234;
           System.out.println("Enter pincode");
           int inputPincode = scanner.nextInt();
          
           if (inputPincode == pincode) {
        	System.out.println("Access granted");
     }else {
    	 System.out.println("Denied");
    	 
     }
           
        /*Ask a user to enter a number and check if it odd or even.
         *    If even print "it is even number. else print it is odd number
         */
          System.out.println("Enter any number");
          int number = scanner.nextInt();
          if(number % 2 == 0) {
        	 System.out.println("Even number"); 
          }else {
         	 System.out.println("Odd number");  
          }
           
           
 }
 }    
            
