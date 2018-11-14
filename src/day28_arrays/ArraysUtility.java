package day28_arrays;

import java.util.Arrays;

public class ArraysUtility {

	public static void main(String[] args) {
		
		String [] students = {"james", "john", "donald", "adam", "obama"};
		
		for (String student: students) {
			if (student.equals("James")) {
				System.out.println("true");
				break;
			}
		}
		//sort is a method of Array
		Arrays.sort(students);
		System.out.println(Arrays.toString(students));
		System.out.println(Arrays.binarySearch(students, "john"));
	}

}
