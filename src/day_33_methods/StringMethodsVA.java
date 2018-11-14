package day_33_methods;

public class StringMethodsVA {

	public static void main(String[] args) {
		
		String original = "Java";
		String reversed = reverse(original);
		
		System.out.println(reversed);
		System.out.println(reverse("computer"));
		
		boolean isPal = IsPalindrome("level");
		System.out.println(isPal);
	}
	/*
	 * Method: reverse
	 * Params: 1 String
	 * Return type: String
	 * It reverses the params String and returns the result
	 */
	
	public static String reverse (String original) {
		String reversed = "";
		
		for (int i =original.length()-1; i >=0; i--) {
			reversed += original.charAt(i);
		}
			
			return reversed;
			
	}
		
		
			/*
			 * Method: isPalindrome
			 * Params: 1 String
			 * Return tyoe: boolean
			 * If param String is palindrome returns true otherwise return dfalse
			 * isPalindrome('civic')-> true
			 * isPalindrome(racecar)-> true
			 * isPalindrome(something -> false
			 */
			
		
	 public static boolean IsPalindrome (String str) {
		 //reverse the string str first
		 String reversed = "";
		 for(int i =str.length()-1; i >=0; i--) {
			 reversed += str.charAt(i);
		 }
		 //compare if str and reversed are same 
		 if(str.equalsIgnoreCase(reversed)) {
			 return true;
		 }
		 
		 return false;
	 }
			
			
			
			
			
			
			
			
			
			
			
			
			
			

}
