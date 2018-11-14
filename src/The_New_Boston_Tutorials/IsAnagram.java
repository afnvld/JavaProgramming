package The_New_Boston_Tutorials;

import java.util.Arrays;

public class IsAnagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("adina", "diana"));
	}

	public static boolean isAnagram(String word1, String word2) {

		// 1. remove white space
		word1.replace(" ", "").toLowerCase();
		word2.replace(" ", "").toLowerCase();
		// 2. remove case
		char[] a1 = word1.toCharArray();
		char[] a2 = word2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);

		if (Arrays.equals(a1, a2)) {
			return true;
		} else {
			return false;
		}

	}

}
