package LoopQuiz1;

import java.util.Scanner;

public class PrimeNumber {
 public static void main(String[]args) {
	//write a program which accepts a number from user and says if it's prime # or not 
 	//prime number is divisible by itself and 1 only
		 
	 boolean isPrime = true;
	 Scanner input = new Scanner(System.in);
	 System.out.println("Please enter a number: ");
	 
	 int number = input.nextInt();
	
	 for(int i=2; i<number;i++) {
         if(number %i == 0) {
            isPrime = false;
            System.out.println("not a prime");
            break;
        }
    }
    if(isPrime) {
        System.out.println("it is a prime number");
    }
    input.close();
	
	 
 }
}
