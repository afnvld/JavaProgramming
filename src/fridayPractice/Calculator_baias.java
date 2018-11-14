package fridayPractice;

public class Calculator_baias {

	public static void main(String[] args) {
		System.out.println(sum(1,5));	
		System.out.println(difference(10,5));	
		System.out.println(multiplication(10,2));	
		System.out.println(division(100,25));
		
	}
	
	private static double sum(double num1, double num2) {
		return num1 + num2;
	}
	
	public static double difference(double num1, double num2) {
		return num1 - num2;
	}
	
	public static double multiplication(double num1, double num2) {
		return num1 * num2;
	}
	
	public static double division(double num1, double num2) {
		return num1 / num2;
	}
	

}
