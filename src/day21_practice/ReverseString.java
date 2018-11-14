package day21_practice;

public class ReverseString {
 public static void main(String[]args) {
	              //0123
	 String word = "java";
	 String reversed ="";
	 
	 for(int idx = word.length()-1; idx >=0;idx-- ) {
		// System.out.print((word.charAt((idx));
		 reversed += word.charAt(idx);
	 }
	 System.out.println(reversed);
	 System.out.println(word);
	 
	 if(word.equals(reversed)){
		 System.out.println("Palindrome");
		 
	 }else {
		 System.out.println("Not Palindrome");
		 
	 }
	 
 }
}
