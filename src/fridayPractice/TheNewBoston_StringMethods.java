package fridayPractice;

public class TheNewBoston_StringMethods {

	public static void main(String[] args) {
		String [] words = {"funk", "shunk", "furry","baconator"};
		
		//startWithMethod
		for(String w : words) {
			if(w.startsWith("fu")) 
				System.out.println(w + " starts with fu");
		}
		//ends with
		for(String w : words) {
			if(w.endsWith("unk"))
				System.out.println(w + " ends with unk");
		}
		
		String s = "buckyrobertbuckyroberts";
		System.out.println(s.indexOf('k',3));
		
		System.out.println(s.indexOf("rob", 10));
		
		String a = "Bacon ";
		String b = "monster";
		System.out.println(a.replace('B', 'F'));
		System.out.println(b.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.trim());
	}

}
