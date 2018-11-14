

	package day14_stringmanipulation_cont;

	import java.util.Scanner;

	public class AddsThings {
	    public static void main(String[] args) {
	        // concat ---> adds two strings together
	        
	        String domain = "@cybertekschool.edu";
	        
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Please enter your username: ");
	        String entry= scan.nextLine();
	        
	        System.out.println("This is your new email school email");
	        // entry.concat(domain)    ===== entry + domain
	        // entry.concat(domain)   == “A” + “B”
	        System.out.println(entry.concat(domain));
	    }
	}
	
	

