package replIt;

import java.util.Scanner;

public class Matches {

	public static void main(String[] args) {
		 Scanner inp = new Scanner(System.in);
		 
		    int rows = inp.nextInt(), cols = inp.nextInt();
		    int[][] arr = new int[rows][cols];
		    for(int i=0 ;i<=rows-1;i++)
		    {
		      for(int j=0 ;j<=cols-1;j++)
		      {
		        arr[i][j]=inp.nextInt();
		      }//end for cols
		    }//end for rows
		    
		    //your code here
		   int matches =0;
		   for(int k =0; k < arr.length; k++) {
			   for( int n=0; n< arr[k].length-1; n++) {
				   if(arr[k][n]!=arr[k].length-1) {
				   }
				   if(arr[k][n] == arr[k][n+1]) {
					  
					   matches++;
				   }
				 }
			  }
		   
		     
				
		   
		   

				
		    
		    
		    System.out.print("matches: "+matches);
		  }//end main
		}
	


