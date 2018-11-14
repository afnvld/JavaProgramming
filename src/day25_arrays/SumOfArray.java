package day25_arrays;

public class SumOfArray {

	public static void main(String[] args) {
		/*create variable nums - assign several values
		 * using a loop calculate the sum and print it 
		 * ADDITIONAL steps:
		 * -calculate sun of even numbers 
		 * -calculate sum of odd numbers
		 */
		
		int nums[]= {34,4,65,754,555,4376,456};
		
		int sum = 0;
		int sumOfEvens =0;
		int sumOfOdds = 0;
		
		for (int n : nums) {
			sum += n;// sum= sum + n
			
			if (n % 2 ==0) {
				sumOfEvens +=n;
			}else {
				sumOfOdds += n;
			}
		}
		System.out.println("Sum is " + sum);
		System.out.println("Sum of evens is:  " + sumOfEvens);
		System.out.println("Sum of odds is: " + sumOfOdds);
	}

}
