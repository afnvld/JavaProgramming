package fridayPractice;

import java.util.Arrays;

public class FizzArray {

	public static void main(String[] args) {

		int n = 4;
		System.out.println(Arrays.toString(fizzArray(n)));
	}

	public static int[] fizzArray(int n) {
		int[] newArr = new int[n];

		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = i;
		}
		return newArr;

	}

}
