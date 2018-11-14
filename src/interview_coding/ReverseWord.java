package interview_coding;

public class ReverseWord {

	public static void main(String[] args) {
		String name = "cybertek";
//		for(int i = name.length()-1; i >=0; i--) {
//		System.out.print(name.charAt(i));
//		}
//		

		char[] arr = name.toCharArray();
		String rev = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			rev += arr[i];

		}
		System.out.println(rev);
	}

}
