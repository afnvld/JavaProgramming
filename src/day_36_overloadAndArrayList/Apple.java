package day_36_overloadAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Apple {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		List<String> letters = new ArrayList<>();

		System.out.println("Size before adding elements: " + names.size());
		names.add("James");
		names.add("John");
		names.add("Trump");
		names.add(0, "Ron");// places Ron to the 1st position
		System.out.println("Size after adding elements: " + names.size());
		System.out.println(names.toString());
		// error ---> List<int> ages = new ArayList<>();
		String myName = names.get(2);
		System.out.println(myName);
		System.out.println(names.indexOf("James"));

		names.remove("Trump");
		System.out.println(names);
	

		List<String> someNames = new ArrayList<>();
		someNames.add("jama");
		someNames.add("blabla");
		System.out.println(someNames);
		addEl(someNames, "esen", "lori", "jen", "tony");
		System.out.println(someNames);
		someNames.addAll(names);
		System.out.println(someNames);
	}

	
		
	
	public static List<String> addEl (List<String> list, String ... ele) {
		for(String i : ele) {
			list.add(i);
		}
		return list;
	}

}
