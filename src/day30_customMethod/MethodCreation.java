package day30_customMethod;

public class MethodCreation {

	public static void main(String[] args) {
		printLastLetter("James");

	}
	public static void printLastLetter (String word) {
		//age will be set to students age
		if(word.isEmpty()) {
			
		return;
		}
		System.out.println(word.charAt(word.length()-1));
	}
	
	public static void setAge(int age) {
		//age will be to set student age
	}

}
