package day30_customMethod;

public class StringMan {

	public static void main(String[] args) {
		char c =getFirstChar("Obama");
		System.out.println(c);

	}
	
	public static char getFirstChar(String word) {
		return word.charAt(0);
		
	}
	
	

}
