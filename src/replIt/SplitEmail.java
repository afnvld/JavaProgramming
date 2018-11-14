package replIt;

import java.util.Scanner;

public class SplitEmail {

	public static void main(String[] args) {
		
    Scanner input = new Scanner(System.in);
    String email = input.nextLine();
    
    String[] arrOfStr = email.split("@"); 
//    
//    String emailId = "";
//    String emailDomain = "";
//    //int count = 0;
//// 
//
//    	
//    for (int a = 0; a < arrOfStr.length; a++) {
//    	if(arrOfStr[a].equals("@")) {
//    		count++;
//    	}
//	}
//    
//    if (count > 2)
//    System.out.println("Email Id: " + emailId);
//    System.out.println("Email Domain: " + emailDomain);
    
    int idx =0;
    int count =0;
    for (int i = 0; i < email.length(); i++) {
		if (email.charAt(i) == '@') {
			idx = i;
			count++;
		}
	}
    
    
    
    String emailId= email.substring(0, idx);
   
    String emailDomain = email.substring(idx+1, email.length());
  
    if(count >1) {
    	System.out.println("invalid email");
    } else if (count == 0) {
    	System.out.println("invalid email");
    } else {
    	System.out.println("Email id: " + email.substring(0, idx));
    	System.out.println("Email Domain: "+ email.substring(idx+1, email.length()));
    }
  }
}
