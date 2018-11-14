package day_34_constructors;

import java.util.Arrays;

public class ExtraTask1 {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 1 };
		insertElmntAtGivenIdx(arr, 10, 2);

	}

	public static int[] insertElmntAtGivenIdx(int[] arr, int target, int targetIdx) {

		int[] newArr = new int[arr.length + 1];
		int temp = 0;

		for (int i = 0; i < newArr.length; i++) {

			if (i == targetIdx) {
				newArr[i + 1] = arr[i];
				arr[i] = target;
			}
		}
		System.out.println(Arrays.toString(arr));

		return arr;
	}

}
