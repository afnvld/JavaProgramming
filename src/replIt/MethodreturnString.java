package replIt;

public class MethodreturnString {

	public static void main(String[] args) {
		System.out.println(limit("abcd", 2));
		System.out.println();
	}
//	 public static int wordCount(String words) {
//		    
//		 String [] arr = words.split(" ");
//		 int count =arr.length;
//		 return count;
//
//		    

//}
	public static String limit(String text, int maxLength)  {
	
		char [] arr = text.toCharArray();
		String empty="";
		for (int i = 0; i < maxLength; i++) {
			empty += arr[i]+ "";
		}
	
	return empty;
	}
	
	public static String removeFirst(String target) {
		   char [] arr = target.toCharArray();
		   String empty ="";
		   for(int i =0; i< arr.length; i++){
		     if(arr[i]!=arr[0]){
		     empty += arr[i];
		     }
		   }
		    return empty;
		    
		  }
	  }
	
