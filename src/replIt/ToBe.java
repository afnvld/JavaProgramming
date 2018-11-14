package replIt;

public class ToBe {

	public static void main(String[] args) {

		StringBuilder bool = new StringBuilder("true,false");
		System.out.println(toBe(bool));

	}

	public static boolean toBe(StringBuilder r) {
		String str = r.toString();
		String[] arr = str.split(",");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equalsIgnoreCase("true")) {
				return true;
			}
		}
		return false;
	}

}
