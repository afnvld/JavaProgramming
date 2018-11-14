package replIt;

import java.util.Scanner;

public class SplitSentence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    String [] arr = sentence.split(" ");
	    for(int i =0; i < arr.length; i++) {
	    	System.out.println(arr[i]);
	    	
	    }
	    }

	}


