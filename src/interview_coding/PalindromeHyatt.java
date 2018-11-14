package interview_coding;

import java.util.Scanner;

public class PalindromeHyatt {

	public static void main(String[] args) {
		String original = "hyatt";
	}

	public String isPal(String str) {

		String reverse = "";

		int length = str.length();

		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);

			if (str.equals(reverse)) {
				return reverse;

			} else {

			}

		}

	}

}
