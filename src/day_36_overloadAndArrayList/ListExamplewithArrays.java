package day_36_overloadAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListExamplewithArrays {

	public static void main(String[] args) {
		// convert Array to ArrayList
		String[] oldNames = { "trump", "obama" };
		List<String> newNames = Arrays.asList(oldNames);
		System.out.println(newNames);

		List<String> names = new ArrayList<>();
		names.add("james");
		names.add("adam");
		names.addAll(newNames);
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);

		
	}
}
