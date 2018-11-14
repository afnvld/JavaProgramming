package day_33_methods;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Assignments_students {
	
//	Pseudo code: 
//	1. Find a size of an actual elements from the file
//	2. Create a new String array with that size
//	3. Iterate through each element again and assign actual elements to the newly created array
	
	public static void main(String[] args) throws FileNotFoundException { 
		
		File file = new File("test.txt");
		Scanner sc=new Scanner(file);
		int count = 0;
		
		while(sc.hasNextLine()){
			String name = sc.nextLine().trim();
//			System.out.println(name);
			if(name.isEmpty()) {
				continue;
			}
			count++;
			// variable name gives each name from the test.txt file
			}
		System.out.println("Count: " + count);
		// Creating the new array with the size of count
		String [] students = new String [count];
		
		// Creating scanner for file again to iterate through one more time
		Scanner scan = new Scanner(file);
		int index = 0;
		// iterating through lines and assigning values to newly created array
		while(scan.hasNextLine()) {
			String name2 = scan.nextLine().trim();
			if(name2.isEmpty()) {
				continue;
			}
			students[index] = name2;
			index++;
		}
		System.out.println(Arrays.toString(students));
		System.out.println("----------------------------\n ");
		generateNewGroup(students, 5);
	}

	
	//	continue; --> skips the current iteration
//	Pseudo code: 
//	0. Create new String array with the given size of group 
//	1. Generate unique number for index to pick randomly one name
//	2. Store value to the newly created array
	
	public static void generateNewGroup(String [] students, int groupSize) {
//		TODO
		String [] newGroup = new String[groupSize];
		int [] indexes = getUniqueRandoms(groupSize, students.length);
		System.out.println(Arrays.toString(indexes));
		
		for(int i = 0; i < indexes.length; i++) {
//			System.out.println(indexes[i]);
			int tempIndex = indexes[i];
			newGroup[i] = students[tempIndex];
		}
		System.out.println(Arrays.toString(newGroup));
	}
	
	public static int[] getUniqueRandoms(int size, int bound) {
		int [] result = new int[size];
		Random random = new Random();
		boolean check = true;
		int index = 0;
		while(check) {
			int ranNum = random.nextInt(bound);
			if(!checkNumberInArray(result, ranNum)) {
				result[index] = ranNum;
				index++;
			}
//			[1,2,3,3,23]
			if(index == size) {
				check = false;
			}
		}
		return result;
	}
	
	public static boolean checkNumberInArray(int [] arr, int target) {
		for(int i: arr) {
			if(i == target) {
				return true;
			}
		}
		return false;
	}

}



