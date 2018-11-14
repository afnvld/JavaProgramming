package day_35_methods;

public class Practice06_LoremIpsum {

	public static void main(String[] args) {
	String ipsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, "
			+ "sed do eiusmod tempor incididunt ut labore et dolore magna "
			+ "aliqua. Risus in hendrerit gravida rutrum. "
			+ "Cursus turpis massa tincidunt dui ut. Quisque non tellus orci ac. "
			+ "In nisl nisi scelerisque eu ultrices vitae auctor eu augue.";
    doesContain(ipsum);
	}
	
	public static boolean doesContain (String str) {
		String [] arr = str.split(".");
		String n ="";
		for(int i =0; i < arr.length; i++) {
			if (arr[i].contains("massa")){
				n+= arr[i];
				return true;
			}else {
				
			}
		}
		return false;
	}
}


	


