package day_32_methods;

import java.util.Arrays;

public class Names2 {

	public static void main(String[] args) {
		String[] names= {"James Bond"," obama","Donald Trump Junior","Adam","John Wick"};
		
		String[] myNames= twoAndMoreWords(names);//names-> 
		System.out.println(Arrays.toString(myNames));
		
	}
	//Pseudo code:
	//create a method that takes/accepts String Array
	//and returns String array
	//Logic: method should find an element that consist of 2 or more words and return that
	//input: 
	
	public static String[] twoAndMoreWords (String[]nameList) {
	int count =0;
	for(String each: nameList) {
		each =each.trim();
	//	System.out.println(each);
		if(each.contains(" ")) {//finding out if name has 2 names
			
		//	System.out.print(each);
			count++;
		}
		
	}
	//create new array to store names with last names
	String [] newArray = new String[count];
//	System.out.println("Count is " + count);
	
	int idx=0;
	for (int i =0; i< nameList.length; i++) {
		String name1 = nameList[i];//.trim(); or trim in line below
	//	System.out.println(name1);//gives each element one by one
		name1= name1.trim();//do it so get rid of spaces before obama
		if(name1.contains(" ")) {
			newArray[idx]= name1;
			idx++;
		}
	}
	return newArray;
 }

}



