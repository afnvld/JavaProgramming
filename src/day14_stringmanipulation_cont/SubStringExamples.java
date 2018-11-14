package day14_stringmanipulation_cont;

public class SubStringExamples {
 public static void main(String[]args) {
	 //substring gets part of a string
	 //there are two versions, 1 takes 1 int; 1 takes 2 ints
	 //if it takes 1 int, it means starting point
	 //we cannot give >number that the length, it will throw exception
	 //if we give number equal length, it will return empty string
	 
	 String str = "donaldtheduck@gmail.com";
	 
	 System.out.println(str.substring(14));
	 //  2 INT
	 //first number is the where the new string will string from
	 //second number is where the new string will end
	 
	 System.out.println(str.substring(19, 20));

	 
	 
 }
}
