package day16_reviewsession1;

public class PrimitivesReview {
 public static void main(String[]args) {
	 
	 /*
	  * DATA TYPES IN JAVA:
	  *  1) primitives
	  *  2) objects/class types/non-primitive
	  *  
	  *  PRIMITIVES:
	  *  WholeNumbers/Integer:
	  *     byte->short->int->long
	  *  Floating point numbers/Numbers with Decimals:
	  *     float > double
	  *  Character tyoe:
	  *       char
	  *  Boolean:
	  *       true/false
	  */      
	 
	 byte chairs = 70;
	 byte secondRoomChair = 50;
	 
	 //first room has __ chairs and second room has __ chairs __
	 //there are __chairs more in frist room
	 System.out.println("First room has "+chairs+" chairs and second room has "+
	          secondRoomChair + " chairs\n" +
			  "there are "+(chairs-secondRoomChair) + " more in first room");
short shortValue = 32000;
System.out.println("Short value:" + shortValue);

int intValue = shortValue; // small can fit into large type. Implicit/Automatic casting
System.out.println(intValue);
intValue = intValue * 100;//3200000

shortValue = (short)intValue; // explicit casting/converting
System.out.println("Short after casting: " + shortValue);

int cityPopulation = 200_000_000; // underscores are allowed so that we can read easier.
							  //compiler will ignore those 
							  //you number cannot start or end with underscore

System.out.println(cityPopulation);

long worldPopulation = 8_000_000_000L;
System.out.println("Current world population according to Cybertek java students is " +worldPopulation );
/*
* short shortNum = 500;
* byte byteNum = (byte)shortNum;
* 
* 
*/
short shortNum = 500;
byte byteNum = (byte)shortNum;

System.out.println(byteNum);

double price = 45.33, discount = 12.5;

double total = price = discount = 9.99;
//int i = 10+100;
System.out.println(price);
System.out.println(discount);
System.out.println(total);



	 
	 
	 
	 
	 
 }
}
