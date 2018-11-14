package day27_arrays04;

public class ArrayCopySomeValues {

	public static void main(String[] args) {
		String[]arr = {"zero", "one", "two","three","four", "keys"};
		//count how many words have 'e' in the arr
		int counter = 0;
		for (String str: arr) {
			if(str.contains("e")) {
				counter++;
			}
		}
		System.out.println(counter);
		//create array fewValues, with size of counter
		String[] fewValues = new String[counter];
		//go over arr one more time and add the words 'e' into few values 
		
        int i =0;
        
        for (int j =0; j < arr.length; j++) {
        	if(arr[j].contains("e")) {
        		fewValues[i] = arr[j];
        		i++;
        		
        	}
        	
        }
		for (String val : fewValues) {
			System.out.print(val + " ");
		}
	}

}
