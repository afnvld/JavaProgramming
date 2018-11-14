package day16_reviewsession1;

public class Operators {
public static void main(String[]args) {
	/*
	 * arithmetic operators: +, -, /, *, %
	 * shorthand assignment: +=; -=; *=; %=
	 * increment/decrement: --; ++
	 * comparison: >, >=, <, <=, ==,!=
	 * 
	 */
	
	/*distanceInMiles, pace(miles per hour)
	 * How many minutes it will take to reach destination 
	 */
	
	//50 miles to go, speed 5 mp, how mny min?
	 double distance= 34;
	 double pace= 20;
	 double minutes = distance / pace * 60;
	 
	 System.out.println("Minute to reach destination:" + minutes);
	
	 //you spend 5 min in traffic
	 minutes += 5.0;
	 //you spend one extra min caz you took wrong turn
	 minutes++;
	 System.out.println("Finally it takes: " + minutes + "minutes");
	 
	 int number = 10;
	 System.out.println(number / 3); //33
	 System.out.println(number % 3); //1
	 
	 System.out.println(number);
	 ++number;
	 System.out.println(number);
	 number++;// add 1
	 System.out.println(number);

	 int num2 = ++number;
	 System.out.println(num2);
	 System.out.println(number);
             //13         14+1
	 num2 = number++ + ++number;
	 
	 System.out.println(num2);//28
	 System.out.println(number);//15

	 
	 
	 
	 
	 
	 
	 
	 
	 

	 
	
}
}
