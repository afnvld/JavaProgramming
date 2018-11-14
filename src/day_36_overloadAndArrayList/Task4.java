package day_36_overloadAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {

	public static void main(String[] args) {
//		String[] arr = {"james", "adam", "john", "elize"};
//		List<String> list= Arrays.asList(arr);

		List<String> names = new ArrayList<>();
		names.add("jamks");
		names.add("john");
		names.add("elizj");
		names.add("almja");

		removeEl(names, 4);
	}

	public static void removeEl(List<String> list, int size) {
		List<String> newList = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() != size) {
			newList.add(list.get(i));
			}
		}
		System.out.println(newList);

	}

}
