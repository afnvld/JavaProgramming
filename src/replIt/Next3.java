package replIt;

import java.util.Scanner;

public class Next3 {

	public static void main(String[] args) {
		
		     Scanner inp = new Scanner(System.in);
		     System.out.print("enter number");
		     int nums=inp.nextInt();
		     next3(nums) ;
	}
		     public static void next3 (int nums) {
		   // 	 String next="";
		    	 System.out.println(++nums + " " + ++nums + " "+ ++nums);
		     }	
		
	}

		//int num = inp.nextInt();
		//next3(num);
		//
		//}
		//public static void next3(int number){
		//String next = "";
		//for(int i = 0;i < 3;i++){
		// number++;
		// next+=number+" ";
		//
		//}
		//System.out.println(next);//
		//}
		//
		//
		//
		//
		//}
