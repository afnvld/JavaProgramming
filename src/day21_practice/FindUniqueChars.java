package day21_practice;

public class FindUniqueChars {
  public static void main(String[]args) {
//accept a String and print only unique characters
	  //speedlimit
	  //spedlimt
	  //"java"
	  //"jav"
	  
	  String str = "missisipi";
	  String str1 ="";
	  
	  for (int idx = 0; idx < str.length(); idx++ ) {
		  if(!str1.contains(str.substring(idx, idx+1))) {
			 //str1=str1+str.subsrting(idx)
			  str1+= str.substring(idx, idx+1);
		  }
	  }
	 System.out.println(str1);
	 
 }
}
