package day19_loops02;

import java.util.Scanner;

public class WarmUpTasks {
 public static void main(String[]args) {
	 /*1. Write a program that takes string word and converts first
	  *   letter to uppercase and the rest to lowercase
	  *   print it after conversation
	  */
	 Scanner input = new Scanner(System.in);
	 System.out.println("Type a word to covert: ");
	 
	 String word = input.next();
	 //substring to take first letter of the word
	 //System.out.println(word.substring(0,1).toUpperCase());
	 //System.out.println(word.substring(1).toLowerCase());
	 word = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
	 System.out.println(word);
	 
	 /*
	  * 2. Write a program to print numbers from 1 to 10.
	  *  in same line, separated by space
	  */
	 int num =1;
	 while(num <= 10) {
		 System.out.print(num + ""); //prin num with space
		 num++; //add one to num
		 
	 }
	     System.out.println("Num value: " + num);
	 
 }
}
