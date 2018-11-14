package day25_arrays;

public class ArrayFindDublicate {

	public static void main(String[] args) {
		

		int arr[] = {2,1,9,1,6,7,2,9,10, 11, 2};
		
		
		
		for(int i=0; i< arr.length; i++) {
			for(int j=i+1; j < arr.length; j++) {
			if(arr[i] == arr[j]) { // &&i!=j
				System.out.println("This is dublicate: " + arr[i]);
			}
		}
      }
	}

}
