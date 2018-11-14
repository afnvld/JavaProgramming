package fridayPractice;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		String newWords = "Java is fun Java";
		//shows "Java" s index place
		int idx = newWords.indexOf("Java");// idx of 0
		System.out.println(idx);

		//shows last index of Java
		int lastIdx = newWords.lastIndexOf("Java");
		System.out.println(lastIdx);// idx of 12 (counting number of chars)

		//cuts String from 2 to 5th 
		String cut = newWords.substring(0, 6);//java i --> from second to 5th
		System.out.println(cut);
		
		//replaces J with V
		String repl = newWords.replace("J", "V");//vava is fun vava
		System.out.println(repl);
		
		//replaces all av to ef
		String repl1 = newWords.replaceAll("av", "ef");//jefa is fun jefa
		System.out.println(repl1);
		
		//boolean true or false
		boolean cont = newWords.contains("jama");
		System.out.println(cont);
		
		//splits array by space
		String[] array1= newWords.split(" ");// [Java, is, fun, Java]
		System.out.println(Arrays.toString(array1));
		
		char[] arr = newWords.toCharArray();
		System.out.println(arr);//Java is fun Java
		
		//if ends with 11
		boolean end = newWords.endsWith("11");//false
		System.out.println(end);
		
	}

}
