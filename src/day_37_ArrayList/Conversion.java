package day_37_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Conversion {

	public static void main(String[] args) {
		// auto boxing and Unboxing
		// if int gets converted to Integer type then it's called autoboxing
		// Autoboxing - automatically converting from primitive to Object type
		int age = 56;
		Integer age2 = age;// when convert yo don't need to cast it
		boolean raining = false;
		Boolean raining2 = raining;
		int i = 10;
		List<Integer> ages = new ArrayList<>();
		ages.add(i);
		// value of method --> gets certain data type
		String amount = "transaction is 45.3";
		String[] words = amount.split(" ");
		double d = Double.valueOf(words[words.length - 1]);
		System.out.println(d);
	//	amount = amount.replaceAll("\\D+", "");
	//	System.out.println(amount);
		
		// if Integer gets comverted to int type then it's Unboxing

	}

}
