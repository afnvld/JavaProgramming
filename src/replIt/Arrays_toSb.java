package replIt;

import java.util.*;
import java.lang.*;

public class Arrays_toSb {

	public static void main(String[] args) {

		String[] arr = new String[] { "a", "1", "2" };

		StringBuilder recipt = arrayToSb(arr);
		System.out.print(recipt.toString());

	}// end main

	public static StringBuilder arrayToSb(String[] r) {

		StringBuilder sb = new StringBuilder();
		for (String each : r) {
			sb.append(each);
		}

		return sb;
	}

}
