package day18_loops1;

public class Task1 {
 public static void main(String[]args) {
	//-Create a string variable SMSmessage, assign following value:
	String SMSmessage = new String("Sender:<Shaun Smith>. From Number:[312-123-3456]. Message:{I love programing and problem solving. Java is fun}");
//-Create 3 string variables:
//sender, phoneNumber,message
	String sender, phoneNumber, message;
			
	sender = SMSmessage.substring(SMSmessage.indexOf("<")+1, SMSmessage.indexOf(">"));
	System.out.println(sender);
	phoneNumber = SMSmessage.substring(SMSmessage.indexOf("[")+1, SMSmessage.indexOf("]"));
	System.out.println(phoneNumber);
	message = SMSmessage.substring(SMSmessage.indexOf("{")+1, SMSmessage.indexOf("}"));
	System.out.println(message);
			
	 
	 String garage = "Toyota, Nissan, Honda, BMW, Mazerati, Ford";
	 //convert whole garage into lowercase letters
	 garage=garage.toLowerCase();
	 System.out.println(garage);
	 
	 //if garage isEmpty print "no cars in garage"
	 if(garage.isEmpty()) {
		 System.out.println("no cars in garage");
	 }
//how do find one string within another string
	 //1. CONTAINS method 
	 //2. INDEXOF > -1
		if(garage.contains("toyota")|| garage.contains("nissan")) {
			System.out.println("There is a Japanese car in garage");
		}else {
			System.out.println("No Japanese cars");
		}
		
		if(garage.indexOf("bmw")> -1 ) {
			System.out.println("There is a German car in garage");
		
		}else {
			System.out.println("No German cars");
		}
		if(garage.contains("jaguar")) {
			System.out.println("there is a british car in garage");
		}else {
			System.out.println("no british cars");
		}
		
		
		String str = "Java is fun";
		//whenever indexOf finds the string, it gives a 0 or a positive index number
		System.out.println(str.indexOf("is"));
		//whenever indexOf cannot find the string, it gives us -1
		System.out.println(str.indexOf("this"));//-1 
		
		
		
		
		
		
 }
}
