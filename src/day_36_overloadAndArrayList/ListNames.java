package day_36_overloadAndArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListNames {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> names = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			System.out.println("Please enter name: " + (i + 1) + ": ");
			String name = scan.nextLine();
			names.add(name);
		}

		System.out.println(names);

	}

}
