package day_32_methods;

import java.util.Arrays;

public class StudentList {

	public static void main(String[] args) {
		String[] names= {"James Bond", "Donald Trump Junior", "Adam", "John Wick"};
		String[] newArr = getNamesWithLastNames(names);
		System.out.println(Arrays.toString(newArr));
	}

	
	//flow
	//1. count the elements that have 2 or more words
	//2. create array of Strings with the count size
	//3. iterate through each element again and set elements 
	//with 2 or more words to newly created array
	
	//create a method that takes/accepts String Array
	//and returns String array
	//Logic: method should find an element that consist of 2 or more words and return that
	
	public static String[] getNamesWithLastNames (String[]names) {
		int count =0; 
		for(String name : names) {
			//name.contains(" ")-> other approach
			System.out.println(name);
			name = name.trim();//trim it first so there is no something like " john"
			int numOfWords= name.split(" ").length;
			if(numOfWords > 1) {
				count++;
			}
		}
		String [] result = new String[count];
		int idx=0;
		for(String name : names) {
			name = name.trim();
			int numOfWords= name.split(" ").length;
			if(numOfWords > 1) {
				result[idx]=name;
				idx++;
			}
		}
		return result;
		
	}
}