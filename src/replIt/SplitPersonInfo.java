package replIt;

import java.util.Scanner;

public class SplitPersonInfo {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		String s = inp.next();
		person("jon, doe, 30");
	}

	public static void person(String info) {

		String [] arr = info.split(",");
	    System.out.print("person name: " + arr[0] + " ");
	    System.out.print("last name: " + arr[1] + " ");
	    System.out.print("age: " + arr[2]);
	}

}