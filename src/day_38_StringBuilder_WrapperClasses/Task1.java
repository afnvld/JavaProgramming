package day_38_StringBuilder_WrapperClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task1 {

	public static void main(String[] args) {
		String word = "seqconuences";
		modifiedWord(word);
		modifiedWord(word, "seq");
		takeInt(3, 69);
	}

	public static String modifiedWord(String word) {
		String empty = "";
		if (word.contains(" ")) {
			System.out.println("Invalid data");
			return empty;
		} else if (word.length() < 3) {
			System.out.println("Invalid data");
			return empty;
		}
		if (word.length() == 3) {
		} else if (word.toLowerCase().contains("con")) {
			StringBuilder sb = new StringBuilder(word);
			sb.delete(word.indexOf("con"), word.indexOf("con") + 3);
			String ss = sb.toString();
			System.out.println(ss);
			return ss;
		} else {
		}
		System.out.println(word);
		return word;

	}

	public static void modifiedWord(String word, String targetWord) {
		if (word.toLowerCase().contains(targetWord)) {
			StringBuilder sb = new StringBuilder(word);
			sb.delete(word.indexOf(targetWord), word.indexOf(targetWord) + targetWord.length());
			String ss = sb.toString();
			System.out.println(ss);

		}
	}
	
	public static List<Integer> takeInt (int size, int bound){
		List<Integer> list = new ArrayList<>();
		Random rand = new Random();
		for(int i =0; i < size; i ++) {
			list.add(rand.nextInt(bound));
		}
		System.out.println(list);
		return list;
	}
	
}
