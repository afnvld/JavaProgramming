package day10_conditionals4;

public class FizzBuzz {
public static void main(String []args) {
	/* 3.if number is divisible by 3 (no remainder), print "Fizz"
	 *  if number is divisible by 5 (no remainder), print "Buzz"
	 * if number is divisible by 5 and 3, print "FizzBuzz"
	 * if else print number itself
	 */
	int number = 10;
	
	if(number % 3 == 0 && number % 5 == 0) {
		System.out.println("FizzBuzz");
    }else if(number % 3 == 0) { 
		System.out.println("Fizz");
	}else if(number % 5 == 0) {
		System.out.println("Buzz");
		
	}else {
		System.out.println(number);
	}
}
}
