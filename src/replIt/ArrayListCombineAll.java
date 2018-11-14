package replIt;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCombineAll {

	public static void main(String[] args) {
		ArrayList <String> one = new ArrayList();
		one.add("java");
		ArrayList <String> two = new ArrayList();
		two.add("is fun");
		combineAL(one,two);
	}

	public static ArrayList<String> combineAL(ArrayList<String>wordList1, ArrayList<String>wordList2) {
		
		List<String> newList = new ArrayList<>();
		
		
		newList.addAll(wordList1);
		newList.addAll(wordList2);
		System.out.println(newList);
		return (ArrayList<String>) newList;

	}

}
