package replIt;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MethodWithArrayList1 {

	public static void main(String[] args) {
		String arr[] = { "f", "o", "o" };
		String arr2[] = { " b", "a", "r" };
		combineRs(arr, arr2);
	}

	public static String combineRs(String[] r1, String[] r2) {
		List<String> newList = new ArrayList<>();
		List <String> list1 = Arrays.asList(r1);
		List <String> list2 = Arrays.asList(r2);
		newList.addAll(list1);
		newList.addAll(list2);
		
		String empty ="";
		for(String s : newList) {
			empty+=s;
		}
		//System.out.println(empty);
		return empty;
		
		
	}
}
