package homeWork;

import java.util.Arrays;

public class Array_home_practice {

	public static void main(String[] args) {

		int [] arr = new int[6];
		arr[0]= 1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		arr[5]=6;
	String arrString = Arrays.toString(arr);
//	System.out.println(arr[3]);
	
//		System.out.println(arrString);
		
//		int [] arr2 = new int [] {1,2,3,4,5,6,7};
//		for(int i=0; i < arr2.length; i++) {
//			System.out.print(arr2[i] + " ");
//		}
//		
//		
//		for (int i : arr2) {
//			System.out.print(i);
//		}
		
		String str = "jhbubyb";
		//            012345678
		String str2 = "htredfty";
		System.out.println(str.charAt(1));
		System.out.println(str.length());
		System.out.println(str.substring(4));
		System.out.println(str.concat(str2));
		System.out.println(str.equals(str2));
		System.out.println(str2.indexOf('e'));
		System.out.println(str.isEmpty());
		
	}

}
