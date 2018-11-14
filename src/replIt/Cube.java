package replIt;

import java.util.Scanner;

public class Cube {

		public static void cube()
		  {
		    
		    Scanner scan = new Scanner(System.in);
		    System.out.println("insert number" );
		    int num =scan.nextInt();
		    System.out.println("Cube of a number" + num + "=" + (num*num*num));
		  }//end cube
		  
		  public static void main(String[] args) {
		    
		    cube();
		   
		  }
		

	}


