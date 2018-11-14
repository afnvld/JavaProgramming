package day_44_recap_sunday;

import java.util.Random;

public class CustomData {
	String str;

	static String generateUsername(String str) {
		Random ran = new Random();
		int rand1 = ran.nextInt(100);

		str = str.replace(" ", "").toLowerCase();

		return str + rand1;
	}

	static String generatePassword(String pas) {
		Random rand = new Random();
		int rand2 = rand.nextInt(500);

		pas = pas.replace(" ", "");

		StringBuilder sb = new StringBuilder();
		sb.append(pas);
		sb = sb.reverse().append(rand2);
		return sb.toString().toLowerCase();
	}
}
