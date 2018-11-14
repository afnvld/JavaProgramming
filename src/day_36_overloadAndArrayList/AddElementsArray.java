package day_36_overloadAndArrayList;

import java.util.Arrays;

public class AddElementsArray {

	public static void main(String[] args) {
		int[] arr1 = { 10, 40, 50, 3, 1};
		int[] arr2 = { 11, 0, 500, 44, 1101};
		int[] arr3= addElements(arr1, arr2);
		System.out.println(Arrays.toString(arr3));
	}

	/*
	 * method name : addElements return: int array args: 2 int arrays
	 */
	public static int[] addElements(int[] ints1, int[] ints2) {
		// create a new array here
		int[] newArr = new int[ints1.length];
		// go to each elem in arrays and add them
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = ints1[i] + ints2[i];
		}
		return newArr;
	}

}
