package day26_Arrays;

import java.util.Scanner;

public class ToCharArray {

	public static void main(String[] args) {
		String word = "Hello";
		char[]letters = word.toCharArray();
		
		for ( char letter : letters) {//enhanced for loop
			System.out.println(letter);
		}
		String gift = "Diamond Ring";
		//convert to charArray and print reverse 
		
		char[] chars = gift.toCharArray();
		for (int i = chars.length-1; i>= 0; i--) {
			System.out.println(chars[i]);
		}
		
		String sen = "Don't hang";
//		char[] chars2 = sen.toCharArray();
//		
//		for (int j = chars2.length-1; j >=0; j--) {
//			System.out.print(chars2[j]);
//		}
		
		String word2 = "";
		for (int k = sen.length()-1; k>=0; k--) {
			word2 += sen.charAt(k);
		}
		System.out.println(word2);
		
		
		    Scanner input = new Scanner(System.in);
		    String sentence = input.nextLine();
		    
		String[]split = sentence.split(" ");
        for(int id= split.length-1; id>=0; id--){
       System.out.println(split[id]);
     
    }
	}

}
