package day21_practice;

public class Remainder {

	public static void main(String[] args) {
		/* loop through numbers from 1 to 50
		 * print each number in same line, separated by space
		 * if a number is divisible by 5 then skip it
		 * if a number is divisible by 20 then exit the loop
		 */
		for(int num =1; num<= 50; num++) {
			if(num % 5 == 0) {
				continue;
			}
			if(num % 20 == 0) {
				break;
			}
			System.out.print(num+" ");
		}

	}

}
