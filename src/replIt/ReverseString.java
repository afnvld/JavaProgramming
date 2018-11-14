package replIt;

public class ReverseString {

	public static void main(String[] args) {
		String str = "student";
		System.out.println(reverse(str));
	}
	public static String reverse(String input){
		String empty ="";
    char[] newArr = input.toCharArray();
    for(int i =newArr.length-1; i>=0; i--) {
    	empty += newArr[i] + "";
    
    }
		return empty;
		
  }
}