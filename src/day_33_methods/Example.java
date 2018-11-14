package day_33_methods;

import java.util.Arrays;


public class Example {

	public static void main(String[] args) {
		
		String name ="obama";
		nameOfMethod("obama", 2);
	
	}
	
	public static void nameOfMethod (String word, int num) {
		String pres =" ";
		String[] name = word.split(word, 3);
		int number =0;
		
		for (int i =0; i < name.length; i++) {
			if(name[i].equals("a")) {
				System.out.println(name);
			}
		}
		
//		String s = word.substring(num);
//		System.out.println(s);


	}

}
