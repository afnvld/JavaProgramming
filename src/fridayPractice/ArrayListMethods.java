package fridayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {

		String[] name1 = { "hello", "world", "cybertek" };
		name1[1] = "dovlet";// replaces world with dovlet
		System.out.println(Arrays.toString(name1));// [hello, dovlet, cybertek]

		List<String> name = new ArrayList<>();
		name.add("hello");
		name.add("world");
		name.add("cybertek");
		// adds dovlet to the 1st index and moves others one space upfront
		name.add(1, "dovlet");
		System.out.println(name);// [hello, dovlet, world, cybertek]

		String name2 = name.get(1);
		System.out.println(name2);// dovlet

		
		boolean b =name.contains("dovlet");//return true or false
		System.out.println(b);//true
		
		//name.retainAll("baias");--> method that takes out everything and return "baias"
		
		//name.addAll(c)-->
		
		
		name.clear();
		System.out.println(name);// clears all

	}

}
