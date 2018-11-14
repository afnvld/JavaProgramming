package replIt;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryToDecimal {

	 public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    
		    int[] binary = new int[8];
		    for(int i =0; i < binary.length; i++) {
		      binary[i] = input.nextInt();
		    }
		    
		    //TODO: Write your code below.
		    int sum = 0;
			    int count = 1; 
			    
			    for(int i = binary.length-1; i >= 0; i--) {
			    	if(binary[i] == 0) {
			    		sum = sum+0;
			    	}else if(binary[i] == 1) {
			    		sum = sum + count;
			    		}
			    		count=count*2;
			    	 }
			   System.out.println(sum); 
		  }
		  }
