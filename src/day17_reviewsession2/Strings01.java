package day17_reviewsession2;

public class Strings01 {
public static void main(String[]args) {
	
	//String is a combination of chars
	String greeting = "Hello World!";
	//print number of characters
	System.out.println(greeting.length());
	int len = greeting.length();
	System.out.println("Length:" + len);
			
	//print the first character
	//charAt method
	System.out.println(greeting.charAt(0));
	char firstCh = greeting.charAt(0);
	System.out.println("First char:" + firstCh);
			
    //print last character . try to use 
    //len variable. or dont use len variable
	System.out.println(greeting.charAt(11));
	//StringIndexOutOfBoundsException
	//System.out.println(greeting.charAt(len));//
	System.out.println(greeting.charAt(len-1));
	
	greeting = greeting + "I hope everyone is well";
	char lastCh = greeting.charAt( greeting.length() - 1 );
	System.out.println("Last char: " + lastCh);


	
	
	
 }
}
