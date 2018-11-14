package day_37_ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListStudent {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("test.txt");
		List<String> names = new ArrayList<>();

		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			String name = sc.nextLine().trim();
			// if(!name.isEmpty()){
			names.add(name);
			// }
		}

		for (int i = 0; i < names.size(); i++) {// or if condition above
			String temp = names.get(i);
			if (names.get(i).isEmpty()) {
				names.remove(temp);
			}
		}

		System.out.println(names);
		System.out.println(names.size());
		printStudents(names);
		System.out.println("\n----\n");
		printNameLength(names, 5);
		printNameLength(names, 7);
		System.out.println("\n----\n");
		printFromShortToLong(names);

	}

	public static void printStudents(List<String> students) {
		// iterate through the list
		int num = 4;
		for (int i = 0; i < students.size(); i++) {
			if (i == num) {
				System.out.println(students.get(i));
				System.out.println();
				num += 5;
			} else {
				System.out.print(students.get(i) + "-");
			}
		}
		// keep printing in one line with dash seoarated
		// apply condition to check is a already printed 5 stud names
		// when we hit condition we start new line

	}

	public static void printNameLength(List<String> students, int length) {
		int count = 0;
		for (String each : students) {
			// condition to check name length to given length
			if (each.length() == length) {
				System.out.println(each);
				count++;
			}
		}
		System.out.println("size of names with " + length + " length: " + count);
	}

	public static void printFromShortToLong(List<String> students) {
		for (int i = 3; i < 16; i++) {
			printNameLength(students, i);
		}

	}

}
