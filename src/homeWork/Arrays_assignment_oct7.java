package homeWork;

import java.util.Arrays;

public class Arrays_assignment_oct7 {

	public static void main(String[] args) {
//		TASK #1:
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

//	      TASK #2:
		int[] a = new int[] { 4, 5, 6 };
		int[] b = new int[a.length + 1];

		if (a.length + 1 == b.length) {
			System.out.println(true);
		}

//			TASK #3:
		String[] s_r = new String[] { "foo", "hello", "bar", "world" };

		for (int i = 0; i < s_r.length; i++) {
			if ((s_r[i].equals("foo")) || (s_r[i].equals("bar"))) {
				System.out.print(s_r[i] + " ");
			}
		}

//			TASK #4:
		double[] d_r = new double[] { 0.2, 0.3, 1.0, 1.5, 2.0 };
		double sum = 2.5;
		for (int i = 0; i < d_r.length; i++) {
			for (int j = i + 1; j < d_r.length; j++) {
				if (d_r[i] + d_r[j] == sum) {
					System.out.println(d_r[i] + d_r[j]);
				}
			}
		}
		System.out.println();

//			TASK #5
		int[] nums = new int[] { 5, 4, 3, 7, 8, 11 };
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 != 0) {
				System.out.println("The number is odd: " + nums[i]);
			} else {
				System.out.println("The number is even: " + nums[i]);
			}
		}

//			TASK #6
		int[] nums2 = new int[] { 6, 7, 11, 12, 2, 3 };
		int sum1 = 0;
		for (int i = 0; i < nums2.length; i++) {
			sum1 += nums2[i];
		}
		System.out.println(sum1);

//			TASK #7
		int[] nums3 = new int[] { 60, 73, 9, 15, 200, 350 };
		int biggest = nums3[0];
		for (int i = 0; i < nums3.length; i++) {
			if (nums3[i] > biggest) {
				biggest = nums3[i];
			}
		}
		System.out.println(biggest);

//			TASK #8
		String[] list = new String[] { "banana", "apple", "pineapple", "banana", "mango", "banana" };
		int count = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i].equals("banana")) {
				count++;
			}
		}
		System.out.println("we have " + count + " bananas");

//			TASK #9
		String[] old_r = new String[] { "one", "two", "three" };
		String new_word = "four";
		String[] new_r = new String[old_r.length + 1];

		int m=0;
		for(String each : old_r) {
			new_r[m]= each;
			m++;
		}
		new_r[new_r.length-1]= new_word;
		
		System.out.println(Arrays.toString(new_r));


		
		

	}

}
