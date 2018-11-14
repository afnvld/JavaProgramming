package homeWork;

public class FindMaxNumber {

	public static void main(String[] args) {
		String [] words = {"jshddjfk", "ksjdhbffpeje", "ksjhdbb"};
		
		String longestWord = "";
		
		for (int i =0; i < words.length; i++) {
			if (longestWord.length()< words[i].length()) {
				longestWord = words[i];
			}
		}
		System.out.println(longestWord);
		
		
	}

}
