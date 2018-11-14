package day_36_overloadAndArrayList;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		words.add("james");
		words.add("apples");
		words.add("go");
		words.add("come");
		words.add("to");
		insertWord(words);
		String str = "hi";
		insertWord(words, str);
	}

	public static void insertWord(List<String> list) {
		List<String> newList = new ArrayList<>();
		String greet = "hello";
		int size = 2;
		for (int i = 0; i < list.size(); i++) {
			newList.add(list.get(i));
			if (list.get(i).length()== size) {
				newList.set(i, list.get(i).charAt(0) + greet);

			}
		}
		System.out.println(newList);
	
	}
	
	public static void insertWord(List<String> l1, String targetWord) {
		int size =2;
		for(int i =0; i < l1.size(); i++) {
			if(l1.get(i).length()==size) {
				l1.set(i, l1.get(i).charAt(0) + targetWord + l1.get(i).charAt(1));
			}
		}
		System.out.println(l1);
	
	}
}
