package replIt;

public class TrimPost {

	public static void main(String[] args) {

		String[] arr = new String[] { "abcde", "12345678", "a very long post" };

	}// end main

	public StringBuilder trim_posts(String[] r, int size) {

		for (int i = 0; i < r.length; i++) {
			if (r[i].length()< size) {
				r[i].concat("<br>");
			}
			
		}
	}

}
