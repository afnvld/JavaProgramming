package replIt;

import java.util.Scanner;

public class Method1_VOID {

	public static void main(String[] args) {
		plus();
		
	}

	
	public static void plus() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first number:");
		int num = scan.nextInt();
		System.out.println("enter second number:");
		int num2 = scan.nextInt();
		System.out.println("result:" + (num+ num2));
	}
}
