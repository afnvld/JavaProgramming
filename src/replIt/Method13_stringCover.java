package replIt;

import java.util.Arrays;

public class Method13_stringCover {

	public static void main(String[] args) {
		 System.out.println(coverString("java methods", "me") ) ; //java [me]thods
	  }

	  
	  
	  
		  
		  
	  public static String coverString(String main, String coverME) {
		  String cont="";
		  if(main.contains(coverME)) {
			 cont=main.replace(coverME, "[" + coverME + "]");
		  }else {
			  cont = "[" + main + "]";
		  }
		  return cont;
	  }		
//		  }
	  }
	  
	  
	  
	  

