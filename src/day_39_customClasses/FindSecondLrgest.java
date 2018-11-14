package day_39_customClasses;

public class FindSecondLrgest {

	public static void main(String[] args) {
		int[] nums = { 6, 2, 3, 4 };
		findLargest(nums);
	}

	public static void findLargest(int[] arr) {
		int largest = arr[0];
		int secLar = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (largest < arr[i]) {
				largest = arr[i];
			}
		}
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] > secLar && arr[j] < largest) {
				secLar = arr[j];
		}
		System.out.println(secLar);
		System.out.println(largest);

	}
	}}
