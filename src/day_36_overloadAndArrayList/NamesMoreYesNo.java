package day_36_overloadAndArrayList;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class NamesMoreYesNo {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		boolean check = true;
		Scanner scan = new Scanner(System.in);
		while (check) {
			System.out.println("Please enter the name: ");
			names.add(scan.nextLine());
			System.out.println("Do you want to continue? Yes.no?");
			String answer = scan.nextLine();
			if (answer.equalsIgnoreCase("no")) {
				check = false;
			}
			System.out.println(names);
		}

	}
}
