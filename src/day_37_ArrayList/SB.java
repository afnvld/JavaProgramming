package day_37_ArrayList;

public class SB {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder ("James");
		System.out.println(sb.hashCode());
		sb.append(" Bond");
		sb.reverse();
		sb.insert(1, "Hello");
		System.out.println(sb);
		System.out.println(sb.hashCode());
//		String s ="James";
//		System.out.println(s.hashCode());
//		s = s + " Bond";
//		System.out.println(s);
//		System.out.println(s.hashCode());

	}

}
