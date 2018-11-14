package replIt;

import java.util.Arrays;

public class IsErrormethod {

	public static void main(String[] args) {
		String str = "error foo bar";
		System.out.println(isError(str));
	}
	
	public static boolean isError(String line) {
		String [] arr = line.split(" ");
		System.out.println(Arrays.toString(arr));
		String s = arr[0];
		if(s.equals("error")) {
			return true;
		}else {
			return false;
		}
		
	    
	  }
	}

