package OffiseHours;

public class ArrayExampleBeka {

	public static void main(String[] args) {
		        //     0 1 2 3 4 
		 int [] arr = {1,3,5,9,3};
		 
		 int targetNumber = 7;
		 for(int i =0; i < arr.length; i++) {
			 
			 for (int j =0; j < arr.length; j++) {
				     //  3      4
				 if (arr[i] + arr[j] == targetNumber) {
					 //  4 1
					 System.out.println(i + "," +j);
				 }
			 }
		 }
		
		
	}

}
