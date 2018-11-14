package day12_classobject_string;

public class Directions {
 public static void main(String [] args) {
	 
			char start, end;
			start = 'A';
			end = 'D';
			
			//check if all valid
			if(!(start >= 'A' && start <='D' && end >= 'A' && end <= 'D')) {
				System.out.println("Invalid start or end");
			}else if(start == end) {
				System.out.println("Already there");
			}else if(start == 'A') {
				if(end == 'B') {
					System.out.println("Go right");
				}else if(end == 'C') {
					System.out.println("Go right -> go down");
				}else if(end == 'D') {
					System.out.println("Go right -> go down -> go left");
				}
			}else if (start == 'B') {
				if(end == 'A') {
					System.out.println("Go down -> go left -> go up");
				}else if(end == 'C') {
					System.out.println("Go down");
				}else if(end == 'D') {
					System.out.println("Go down -> go left");
				}	
			}else if(start == 'C') {
				if(end == 'A') {
					System.out.println("Go left -> go up");
				}else if(end == 'B') {
					System.out.println("Go left -> go up -> go right");
				}else if(end == 'D') {
					System.out.println("Go left");
				}		
			}else if (start == 'D') {
				if(end == 'A') {
					System.out.println("Go up");
				}else if(end == 'B') {
					System.out.println("Go up -> go right");
				}else if(end == 'C') {
					System.out.println("Go up -> go right -> go down");
				}	
			}
			
			
			
		}
	}