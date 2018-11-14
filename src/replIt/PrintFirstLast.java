package replIt;

import java.util.Arrays;
import java.util.Scanner;

public class PrintFirstLast {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = { "hello", "why", "by", "apple", "note" };

		// TODO: Write your code below
		String empty = "";
		for (int i = 0; i < words.length; i++) {
			empty += words[i].charAt(0) + "" + words[i].charAt(words[i].length() - 1) + " ";

		}
		System.out.println(Arrays.toString(empty.split(" ")));
	}

}
