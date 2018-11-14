package day_32_methods;

import java.util.Arrays;
import java.util.Random;

public class GenerateNumbers {

	public static void main(String[] args) {
		int[] arr = genUniqNum(4,15);
		System.out.println(Arrays.toString(arr));	
	}
	
	
	
//continue->
	//Pseudo Code:
    //0.Create new Sring array with the given size of group
    //1.Generate unique number for index to pick randomly one name'
    //2.Store value to the newly created array
	public static void generateNewGroup(String [] students, int groupSize) {
		String [] newGroup = new String [groupSize];
		int [] indexes= genUniqNum(groupSize, students.length);
		System.out.println(Arrays.toString(indexes));
		
		for(int i =0; i < indexes.length; i++) {
			System.out.println(indexes[i]);
			int tempIndex = indexes[i];
			newGroup[i] = students[tempIndex];
		}
	}

	
	/**
	 * this method returns unique random nums for given size and given bound
	 * @param size
	 * @param bound
	 * @returninteger array
	 */
	public static int[] genUniqNum(int size, int bound) {
	//create array with some size
		int[] result = new int[size];
		Random number = new Random();
		boolean check = true;
		int idx =0;
		while(check) {
			int ranNum = number.nextInt(bound);
//		boolean flag =true;
//		for(int i: result) {
//			if ( i == ranNum) {
//			flag = false;
//			}
	//	}
		//if (flag) {	
		if (!checkNumInArray(result, ranNum)) {
				result[idx] = ranNum;
				idx++;
		}
		//[1,2,3,3,23]
		if(idx == size-1) {
			check = false;
		}
      }
		return result;
	}
	/**
	 * this method checks if number in array is repeated
	 * @param arr
	 * @param target
	 * @return
	 */
	public static boolean checkNumInArray (int[]arr, int target) {
		for (int i : arr) {
			if( i == target) {
				return true;
			}
		}
		return false;
	}
}
