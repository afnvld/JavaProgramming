package replIt;

import java.util.Scanner;

public class Method7_plusminus {

		public static void main(String[] args) {
		    Scanner inp = new Scanner(System.in);
		    int size = inp.nextInt();
		    int[] arr = new int[size];
		    for(int i=0 ;i<=size-1;i++)
		    {

		        arr[i]=inp.nextInt();
		    }
		    
		    plus_minus(arr);
		 
		}//end main
		  public static void plus_minus(int[] arr) {
			  int positive =0;
			  int negative=0;
			  int zeros=0;
			  for(int n : arr) {
				  if (n>0) {
					  positive++;
				  }else if (n<0) {
					  negative++;
				  }else {
					  zeros++;
				  }
			  }
			  System.out.println("positive"+ positive+ " "+ " negative"+ negative +" "+
					  				"zeros"+ zeros);
		  }
		  
		
}
