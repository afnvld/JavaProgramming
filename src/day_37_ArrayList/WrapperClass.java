package day_37_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {

	public static void main(String[] args) {
		int age = 26;
		Integer age2 = 26;
		int[] ages = new int[10];
		List<Integer> ages2 = new ArrayList<>();
		ages2.add(34);
		ages2.add(100);

		String s = "512";
		Integer.valueOf(s);
		System.out.println(ages2);

	}

}
