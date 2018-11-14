package replIt;

public class ExtractNum {

	public static void main(String[] args) {
		
    String input ="aa2aa3";
    System.out.println(extractNum(input));
	}
	public static String extractNum(String s) {
	    char [] arr = s.toCharArray();
	    String empty ="";
	    for(int i =0; i < arr.length; i++) {
	    	if(Character.isDigit(arr[i])) {
	    		empty+=arr[i];
	    	}
	    }
		return empty;
		
		   
	  }
	}


