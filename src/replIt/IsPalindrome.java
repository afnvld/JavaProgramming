package replIt;

public class IsPalindrome {

	public static void main(String[] args) {
		String str = "civic";
		System.out.println(isPalindrome(str));

	}

	public static boolean isPalindrome(String check) {
//		check=check.toLowerCase();
//	    check =check.replaceAll(" ", "");
	
//		for(int i =0; i <= check.length()/2; i++) {
//			if(check.charAt(i)!=check.charAt(check.length()-1-i)){
//				return false;
//				
//			}
//		}
//		return true;
	    
	    String palindrome = "";
	    
	    for(int i = check.length() - 1; i >= 0; i--) {
	    	palindrome += check.charAt(i) + "";
	    }
	    
	    return palindrome.equals(check);
	    
//		char[]arr = check.toCharArray();
//		int n =arr.length;
//		for(int i =0; i <(n/2)+1; i++) {
//			if( arr[i]!=(arr[n-i-1]) ){
//				return false;
//			}
//		}
//		return true;
	}
}



