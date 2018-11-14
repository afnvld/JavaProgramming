package homeWork;

public class String_practicehopme01 {
 public static void main(String[]args) {
	 
	 String s1 = "h ello";
	 String s2 = "Hello";
	 
	 int i1 = s1.length();
	 int i2 = s2.length();
	 System.out.println(i1);
	 System.out.println(i2);
	 
	 System.out.println(s1.equals(s2));
			 
	 
	 if (s1.length() == s2.length()) {
		 System.out.println("They are equal");
		 
	 }else {
	 System.out.println("They are not equal");
	 }
 }
}
