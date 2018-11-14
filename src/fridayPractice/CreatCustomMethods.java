package fridayPractice;

public class CreatCustomMethods {

	public String lastName = "Doe";
	public static String name = "Alan";
	
	public static void main(String[] args) {
		//create custom methods that return string, int, double, and one method that is void
		System.out.println(customMethod());
		System.out.println(customMethod2());
		System.out.println(customMethod3());
		customMethod4("");
	
	}
		
		public static String customMethod() {
			return "lala";
		}
		
		public static int customMethod2() {
			return 5;
		}
		public static double customMethod3() {
			return 5.5;
		}
	
		public static void customMethod4(String par) {
			System.out.println (par + "hdgdnb");
			
		}
}
