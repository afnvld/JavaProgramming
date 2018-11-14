package day_36_overloadAndArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListInteger {

	public static void main(String[] args) {
		// create list Integer
		List<Integer> ages = new ArrayList<>();// String
		Scanner scan = new Scanner(System.in);
		// looping questions and adding it to list integer
		for (int i = 0; i < 5; i++) {
			System.out.println("Please enter age: " + (i + 1) + ": ");
			int age = scan.nextInt(); //String ...... +"";
			ages.add(age);
		}
		System.out.println(ages);
	}

}
