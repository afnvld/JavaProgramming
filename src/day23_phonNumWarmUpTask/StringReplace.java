package day23_phonNumWarmUpTask;

public class StringReplace {

	public static void main(String[] args) {
		String sentence = "We are learning Java";
		System.out.println(sentence);
		
		sentence= sentence.replace("Java", "C#");
		
		System.out.println(sentence);
		
//can u replace 'learning' with 'practicing'
		
		
		sentence= sentence.replace("learning", "practicing");
		System.out.println(sentence);
		
		sentence.replaceAll("phyton",  "Java");
		System.out.println(sentence);
		
		sentence.replaceAll("a",  "A");
		System.out.println(sentence);
		
		String word = "abcdefg java selenium";
		System.out.println(word.replace("ava", "unit"));
		System.out.println(word);
		
		String result= "123,456,001 results";
		//remove 'results' and commas  
		result = result.replace("results",  "").replace(",", "");
		System.out.println(result);
		
	}

}
