package day27_arrays04;

public class SplitMethod {

	public static void main(String[] args) {
		String words = "java-selenium-cucumber-testng-junit-eclipse-maven-git-github";
		
		String[] splittedWords=words.split("-");
		
		System.out.println(splittedWords.length);
		System.out.println(splittedWords[0]);
		
		for ( String w :splittedWords) {
			System.out.println(w);
		}
		
		String searchResults = "All categories 'wooden spoon' 13,623 Results.";
		//if you have a sentence as a String, how do you find out how many words in it?
		String [] arrResults = searchResults.split(" ");
		System.out.println("Words count: " + arrResults.length);
		
		
		System.out.println(searchResults.split(" ").length);
		System.out.println(searchResults.split("")[0]);
		//extract number of wooden spoons results and print out 
		System.out.println("Words spoon count: " + arrResults[4]);
		
		
	}

}
