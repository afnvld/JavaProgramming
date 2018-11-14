package day16_reviewsession1;

public class PrintAMessage {
	//main method that Java execution starts from
 public static void main(String[] input) {
	 System.out.println("----WELCOME TO REVIEW SESSION------");
	 System.out.println(123456);//you can print numbers without double quotes
	 System.out.println("Topic 1 is: " + "Printing various messages");
	 
	 int balance = 100;
	 System.out.println("Balance is "+balance);
	 System.out.println("Balance is "+ balance + 55);
	 System.out.println("Balance is "+ (balance + 55));
	 
// print vs println. println also addes new line at the end
	 System.out.print("Today is ");
	 System.out.print("Java review ");
	 System.out.print("day1");// \n, \t 
	 System.out.println();// add a new line
	 System.out.println("Today is ");
	 System.out.println("Java review ");
	 System.out.println("day1");
	 // \n, \t
	 // \is called an escape character .Used to say hey treat character as 
	 System.out.println("Next topic to review is \n datatypes");
	 System.out.println("Next topic to review is \\n datatypes");

	 System.out.println("Largest integer in java is \"long\"");
	 System.out.println("I want to buy \'wooden spoon\' from \"etsy\"");
	 // for '' works with backslash and without\
	 String msg = "I want to buy 'wooden spoon' from \"etsy\"";
	 System.out.println(msg);

	 
	 
 }
}
