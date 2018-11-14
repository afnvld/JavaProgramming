package replIt;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
	
		
		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
//	    String[]split = sentence.split(" ");
//        for(int id= split.length-1; id>=0; id--){
//       System.out.println(split[id]);
//     
//    }
    
	    
	    String reversed ="";
	
	    String[] splitSen = sentence.split(" ");
	    int i=0;
	    for( i =splitSen.length-1; i>=0; i--) {
	    	reversed += splitSen[i] + " ";
	    	
		}
	    reversed =reversed.trim();
		System.out.println(reversed);
	}





		
	}


