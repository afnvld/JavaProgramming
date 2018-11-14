package day_34_constructors;

import java.util.Arrays;

public class CommaSeparatedString {

	public static void main(String[] args) {
		int [] myArr = { 32,4,45,1};
	overlMethod(myArr);
	String [] myStrArr = {"James", "Adam", "John", "Alize" };
	overlMethod(myStrArr, 3);
	String [] namesArr = {"James", "john", "John Wick", "Elize Teron"};
	someMethod(namesArr);
	String [] namesArr2 = {"James", "john", "John Wick", "Elize", "Donald Junior Trump"};
	someMethod(namesArr2, 3);
	
	}
	
	
	public static void overlMethod (int [] arr) {
		for (int i=0; i < arr.length; i++) {	
			if(arr[i]==arr[arr.length-1]) {
				System.out.print(arr[i] + " " );
			}else {
				System.out.print(arr[i] + "," );
			}
		}
		System.out.println("\n");
	}

	
	
	public static void overlMethod (String[] arr, int idx) {
		for(int i =0; i< arr.length; i++) {
			if (arr[i]==arr[arr.length-1]) {
				System.out.print(arr[i] + " ");
			}else {
				System.out.print(arr[i] + ",");
			}
		}
		System.out.println("\n");
	}
	
	
	public static String[] someMethod (String [] studentList) {
		
		
		String n ="";
		System.out.print("[");
		for (int i =0; i < studentList.length; i++) {
		//	count++;
				if (studentList[i].contains(" ")) {
					n += studentList[i] + " ";
			}
		}
		System.out.print(n.trim());
		System.out.print("]" + '\n');
			return studentList;
	}
	
	
	public static String[] someMethod (String [] studentNames, int numOfWords) {
		int count = 0;
		for (int i =0; i < studentNames.length; i++) {
			if (studentNames[i].contains(" ")) {
				for(int j = 0; j < studentNames[i].length(); j++) {
					if (studentNames[i].charAt(j) == ' ') {
						count++;
					}
				}
				
				if (count == numOfWords) {
					System.out.println(studentNames[i]);
				}
			}
		}
			
		return studentNames;
		}
	}
	

