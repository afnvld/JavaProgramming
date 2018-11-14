package replIt;

public class TwoDArrayLargestNum {

	public static void main(String[] args) {

		    //test your code
		    System.out.println(uniqueChars("lambada")) ;
		  }
		  
	public static String uniqueChars(String str) {
		// TODO: write your below
		String empty = "";
		char[] word = str.toCharArray();
		for (int i = 0; i < word.length; i++) {
			int count = 0;
			for (int j = 0; j < word.length; j++) {
				if (i != j && word[i] == word[j]) {
					count++;
				}
			}
			if (count < 1) {
				empty += word[i];
			}
		}
		        return empty;
		    }
		

	}


