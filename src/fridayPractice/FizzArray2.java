package fridayPractice;

import java.util.Arrays;

public class FizzArray2 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(fizzArray2(4)));
	}
	public static String[] fizzArray2(int n) {
		  String [] newArr = new String [n];
		  for(int i =0; i < newArr.length; i++) {
			  newArr[i]=i+ "";
		  }
		  return newArr;
	}
}
