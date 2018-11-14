package interview_coding;

import java.util.Arrays;

public class SecondMin {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		
		Arrays.sort(arr);
		int secMin=arr[1];
		System.out.println(secMin);
//		for(int i=0; i < arr.length; i++) {
//			if(arr[i]< min) {
//				min=arr[i];
//			}
//			System.out.println(min);
//		}
//			for (int j = 0; j < arr.length; j++) {
//				if(arr[j]>min && arr[j]<secMin) {
//					secMin=arr[j];
//				}
//				System.out.println(secMin);
//		}
	}

}
