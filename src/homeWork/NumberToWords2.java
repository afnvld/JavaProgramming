package homeWork;

import java.util.Scanner;

public class NumberToWords2 {

	public static void main(String[] args) {
		/*
		 * Create a program called NumberToWords2.
			Program accepts a number between 0 and 1000
	        And prints the word for the number. 
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any number from 0 to 1000: ");
        
    int number = scan.nextInt();
    int hundreds = number / 100;
    int tens = (number % 100) / 10;
    int ones = (number % 10);
    int teens = 10 + ones;
    int thousand = 1000;
    
    String hun = "";
    String ten = "";
    String on = "";
    String teen = "";

        
        switch (teens) {
        case 11:
            teen = "eleven";
            break;
        case 12:
            teen = "twelve";
            break;
        case 13:
            teen = "thirteen";
            break;
        case 14:
            teen = "fourteen";
            break;
        case 15:
            teen = "fifteen";
            break;
        case 16:
            teen = "sixteen";
            break;
        case 17:
            teen = "seventeen";
            break;
        case 18:
            teen = "eighteen";
            break;
        case 19:
            teen = "nineteen";
            break;
        }
        switch (ones) {
        case 1:
            on = "one";
            break;
        case 2:
            on = "two";
            break;
        case 3:
            on = "three";
            break;
        case 4:
            on = "four";
            break;
        case 5:
            on = "five";
            break;
        case 6:
            on = "six";
            break;
        case 7:
            on = "seven";
            break;
        case 8:
            on = "eight";
            break;
        case 9:
            on = "nine";
            break;
        }
        switch (tens) {
        case 1:
            ten = "ten";
            break;
        case 2:
            ten = "twenty";
            break;
        case 3:
            ten = "thirty";
            break;
        case 4:
            ten = "fourty";
            break;
        case 5:
            ten = "fifty";
            break;
        case 6:
            ten = "sixty";
            break;
        case 7:
            ten = "seventy";
            break;
        case 8:
            ten = "eighty";
            break;
        case 9:
            ten = "ninety";
            break;
        }
        switch (hundreds) {
        case 1:
            hun = "One hundred";
            break;
        case 2:
            hun = "Two hundred";
            break;
        case 3:
            hun = "Three hundred";
            break;
        case 4:
            hun = "Four hundred";
            break;
        case 5:
            hun = "Five hundred";
            break;
        case 6:
            hun = "Six hundred";
            break;
        case 7:
            hun = "Seven hundred";
            break;
        case 8:
            hun = "Eight hundred";
            break;
        case 9:
            hun = "Nine hundred";
            break;
        case 10:
            hun = "One thousand";
            break;
        }
        if (number > 10 && number < 20) {
            System.out.println(teen.substring(0, 1).toUpperCase() + teen.substring(1));
        //} else if(number==1000) {
            //System.out.println("One thousand");
        }else if (number >= 100) {
            if (number % 100 > 10 && number % 100 < 20) {
                System.out.println(hun + " " + teen);
            } else if (number % 100 > 0 && number % 100 < 10) {
                System.out.println(hun + " " + on);
            } else {
                System.out.println(hun + " " + ten + " " + on);
            }
        } else if (number >= 20 && number < 100 || number == 10) {
            System.out.println(ten.substring(0, 1).toUpperCase() + ten.substring(1) + " " + on);
        } else if (number < 10) {
            System.out.println(on.substring(0, 1).toUpperCase() + on.substring(1));
        }
    }

}