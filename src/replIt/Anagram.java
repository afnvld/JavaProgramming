package replIt;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s = "silent";
		String s2 = "listen";
		System.out.println(isAnagram(s, s2));

	}

	public static boolean isAnagram(String word1, String word2) {
		word1.equalsIgnoreCase(word2);
		if (word1.length() != word2.length()) {
			return false;
		} else {

			char[] oneArr = word1.toCharArray();
			char[] twoArr = word2.toCharArray();

			Arrays.sort(oneArr);
			Arrays.sort(twoArr);
			for (int i = 0; i < oneArr.length; i++) {
				if (oneArr[i] != twoArr[i]) {
					return false;
				}
			}
			return true;
		}

	}

}
