package mentoringSession;

public class mentoringWithAibekOCt16 {

	public static void main(String[] args) {
//palindrom
		String word = "arra";
		System.out.println("Is this palindrome: " +isPalindrom(word));
	}
	// create function take string as parameter and return is palindrom or not: boolean
	
	public static boolean isPalindrom (String word) {
		//what is there a n1000000000
		//reverse and compare
		for (int i =0; i < word.length()/2; i++) {
			String character1 = word.charAt(i) + "";
			String character2 = word.charAt(word.length()-1-i) + "";
			if (!character1.equals(character2)) {
				return false;
			}
		}
			
		
		return true;
	}

}
