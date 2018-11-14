package replIt;

public class MergeArrays {

	public static void main(String[] args) {

	}

	public static int[] mergR(int[] a, int[] b) {
		int[] newArr = new int[a.length + b.length];
		int z = 0;

		for (int i = 0; i < a.length; i++) {
			newArr[z] = a[i];
			z++;
		}
		for (int i = 0; i < b.length; i++) {
			newArr[z] = b[i];
			z++;
		}
		return newArr;
	}// end
}
