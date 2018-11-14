package day_38_StringBuilder_WrapperClasses;

public class SBB {

	public static void main(String[] args) {
		String s = new String("James");
		System.out.println(s.hashCode());
		System.out.println("Intitial value: " + s);
		s.substring(1, 3);
		System.out.println("after value: " + s);
		System.out.println(s.hashCode());
		String s2 = "James";
		System.out.println(s2.hashCode());// same address locator

		// ------------------
		// MUTABLE StringBuilder
		// it's original value is changeable
		System.out.println("---MUTABLE EXAMPLES----");
		StringBuilder sb = new StringBuilder("James");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.append(" Bond");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.reverse();
		System.out.println(sb);
		sb.delete(2,4);
		System.out.println(sb);
		sb.insert(2, "Hello");
		System.out.println(sb);
		//convert string to sb
		String str = "Adam";
		StringBuilder str2 = new StringBuilder(str);
		str2.reverse();
		System.out.println(str2);
		//convert back
		str2.toString();
		System.out.println(str);
		
		

	}

}
