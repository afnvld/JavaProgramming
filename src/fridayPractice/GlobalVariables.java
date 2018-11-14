package fridayPractice;

public class GlobalVariables {

	public static String word = "blabla";
	private static String word1 = "amsterdam";
	
	public static void main(String[] args) {
		word = "emmm";
		System.out.println(word);
		System.out.println(word1);
		printString();
		
	}
	public static void printString() {
		System.out.println(word);
}
}
