package replIt;

import java.util.ArrayList;

public class Nanuk {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("6");
		arr.add("6");
		arr.add("nanuk");
		arr.add("nanuk");

		boolean hunt = nanuk(arr, 2, 10);
		if (hunt) {
			System.out.print("successful hunt");
		} else {
			System.out.print("this hunt is doomed");
		}

	}

	public static boolean nanuk(ArrayList<String> r, int way_stones, int boast) {
		/*
		 * Count nanuks Check with number of way stones if number of way stones >=
		 * nanuks return true Count how many fishes they hunted with a number leader
		 * boasted if the sum is number >= than the leader boasted return true else
		 * return false
		 */
		int nannuk = 0;
		int sum = 0;
		for (int i = 0; i < r.size(); i++) {
			if (r.get(i).contains("nanuk")) {
				nannuk++;
			}
		}
		if (!(way_stones >= nannuk)) {
			return false;
		} else {
			for (int j = 0; j < r.size(); j++) {
				if (!r.get(j).contains("nanuk")) {

					sum += Integer.parseInt(r.get(j));
				}
			}
			if (sum >= boast) {
				return true;
			}
		}

		return false;
	}
}
