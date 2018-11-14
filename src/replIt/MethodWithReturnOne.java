package replIt;

public class MethodWithReturnOne {

	public static void main(String[] args) {
	
	String [] arr1 = {"a", "foo", "foo", "loj"};	
    String t="";
	count_appearance(arr1, t);
    
	}
	
	 public static int  count_appearance(String[] arr,String t){
		 int count =0;
		 
		 for(String each: arr) {
			 if(t==each)
			 count++;
		 }
		 
		 return count;
	 }
	
	

}
