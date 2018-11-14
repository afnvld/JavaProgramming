package day31_arraysRecap;

import java.util.Arrays;

public class ArraysGroceryList {

	public static void main(String[] args) {
		
		String [] groceryList = { "apple", "carrot", "orange", "strawberry", "cherry"};
		Arrays.sort(groceryList);
		String apple = groceryList[0];
		String orange= groceryList[3];
	System.out.println("the index num of apple is : " + Arrays.binarySearch(groceryList, apple));
	System.out.println("index num of orange is : " + Arrays.binarySearch(groceryList, orange));
//Sysout (.... + Arr....(groceryList, "orange)); with no assigned strings
		
		
	}

}
