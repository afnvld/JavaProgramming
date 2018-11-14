package replIt;

import java.util.ArrayList;

public class RepeatAll {

	public static void main(String[] args) {
		ArrayList<Boolean> list = new ArrayList<>();
		list.add(true);
		list.add(false);
		list.add(true);
		repeatAL(list);
	}

	// create your method below
	public static void repeatAL(ArrayList<Boolean> bool) {
		ArrayList<Boolean> newList = new ArrayList<>();
		for (int i = 0; i < bool.size(); i++) {
			newList.add(bool.get(i));
		}
		bool.addAll(newList);
		System.out.println(newList);
	}
}
