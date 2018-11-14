package day4_operators;

import java.util.Scanner;//bring(import) Scanner class code so that i can use in my programm

public class AgeCalculatorWithScanner {
  public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	 System.out.println("Enter year of birth");
	 //let user to enter an int number during execution:
	 int yearOfBirth = scan.nextInt();
	 
	 //System.out.println("Year of birth is" + yearOfBirth);
	 //ask for current year or year of death
	 System.out.println("Enter current year:");
	 int currentYear = scan.nextInt();
	 
	 int age = currentYear - yearOfBirth;
	 System.out.println("If you are born on " + yearOfBirth + " and current year is " + currentYear + " then you are " + age + " years old.");
	 
	 
	 scan.close();
}
}
