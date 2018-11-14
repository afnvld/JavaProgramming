package day6_operators_boolean;

public class IncrementDecrementOperators {

	public static void main(String[] args) {
		//sysout --> shortcut for println
		
		int windowsComputers = 35;
		//increase by one. add one
		windowsComputers++;
		windowsComputers++;

		System.out.println(windowsComputers);
		//long way
		windowsComputers = windowsComputers + 1;
		//shorthand operators
		windowsComputers += 1;
		
		System.out.println(windowsComputers);
		
		int unreadMessages = 50;
		System.out.println("unreadMessages: " + unreadMessages);
		System.out.println("Reading one message");	
			
		unreadMessages--;
		System.out.println("Unread Mesaages:" + unreadMessages);
		unreadMessages--;
		System.out.println("unreadMessages: " + unreadMessages);
		
		
	}
	
}
