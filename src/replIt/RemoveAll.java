package replIt;

import java.util.ArrayList;

public class RemoveAll {

	public static void main(String[] args) {

	}

	public static void removeAll(ArrayList<String> wordList, String targetWord) {
		for (int i = 0; i < wordList.size(); i++) {
			if (wordList.get(i).equalsIgnoreCase(targetWord)) {
				wordList.remove(i);
				i--;
			}

		}
	}

}
