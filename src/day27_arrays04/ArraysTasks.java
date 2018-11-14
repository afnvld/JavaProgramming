package day27_arrays04;

public class ArraysTasks {

	public static void main(String[] args) {
		/*
		 * Example: arr--> ["apple", "banana"]
		 * prints app ban
		 */
		String []arr = new String[] {"apples", "banana", "kiwi", "cherries"};
		
		for (String fruit : arr) {
			System.out.println("------FOR LOOP------");
			
			for(int i = 0; i < arr.length; i++) {
				System.out.println(arr[i].substring(0, 3));
			}
		}
		
		
	}

}
