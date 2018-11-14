package fridayPractice;

public class FindSecondLargest {

	public static void main(String[] args) {
		int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
		secondLargest(arr);
	}

	public static void secondLargest(int[] arr) {
		int largest = 0;
		int secondLargest = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];

			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];

			}
		}

		System.out.println("\nSecond largest number is:" + secondLargest);

	}

}
