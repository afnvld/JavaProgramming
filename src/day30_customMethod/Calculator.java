package day30_customMethod;

public class Calculator {

	public static void main(String[] args) {
		int idx =add(34,23);
		System.out.println("Just to make sure: " + idx);
		multiply(45,23);
	}
	
	private static int multiply(int i, int j) {
		return i*j;		
	}

	public static int add(int i, int j) {
		int sum = i + j;
		System.out.println("Sum is: " + sum);
		return sum;
	}

}
