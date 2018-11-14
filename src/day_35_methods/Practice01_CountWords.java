package day_35_methods;

import java.util.Arrays;
import java.util.Scanner;

public class Practice01_CountWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a sentence to be analyzed: ");
		String sentence = scan.nextLine();
		countWords(sentence);
	}
	
	public static void countWords (String str) {
		
		String [] arr = new String [str.split(" ").length];
		String [] newArr = str.split(" ");
		
		int count =0;
		for(int i =0; i< arr.length; i++) {
			count++;
			arr[i]=newArr[i];
			}
		System.out.println("The number of words in this sentence is: " + count);
		System.out.println(Arrays.toString(arr));
		}
	
	
	}


