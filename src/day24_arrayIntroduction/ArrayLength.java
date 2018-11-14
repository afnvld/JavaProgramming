package day24_arrayIntroduction;

public class ArrayLength {

	public static void main(String[] args) {
		// declare array names that store 5 names
		
		String names[];
		names = new String[5];
		
		names[0]= "Adina";
		names[1]= "Jamilya";
		names[2]= "Sophia";
		names[3]="Alanchik";
		names[4]="Raihan";
		
		System.out.println(names.length);//count of values in array
		
		//String name and assign Jamilya to it by reading from array
		String name = names[1];
		System.out.println(name.length());//count of characters in the string 
		

	}

}
