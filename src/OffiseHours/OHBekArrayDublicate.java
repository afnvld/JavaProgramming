package OffiseHours;

public class OHBekArrayDublicate {

	public static void main(String[] args) {
		
		int[] arr= {0,1,2,3,4,5,6,6,7,8,9};
		
		for (int i =0; i < arr.length; i++) {
			//int first = arr[i];
			
			for (int j = i +1; j < arr.length; j++) {
				//int second = arr[j};
				if (arr[i] == arr[j]) {
					System.out.println("This is dublicate: " + arr[i]);// (first)
				}
			}
		}

	}

}
