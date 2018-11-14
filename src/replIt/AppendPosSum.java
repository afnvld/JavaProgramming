package replIt;

import java.util.ArrayList;

public class AppendPosSum {

	public static void main(String[] args) {
		ArrayList<Integer> someList = new ArrayList<>();
		someList.add(5);
		someList.add(4);
		someList.add(3);
		System.out.println(appendPosSum(someList));
	}

	public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list) {

		ArrayList<Integer> newList = new ArrayList<>();

		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > 0) {
				newList.add(list.get(i));
				sum += list.get(i);
			}
		}
		newList.add(sum);
		return newList;
	}

}
