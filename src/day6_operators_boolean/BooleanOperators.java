package day6_operators_boolean;

public class BooleanOperators {
 public static void main (String[] args) {
	 boolean isExpensive = true;
     System.out.println(isExpensive);
     boolean isEnough = false;
     System.out.println("Is it enough? - " + isEnough);

     System.out.println(10 > 5);//true
     System.out.println(100 < 99);//false

 int count = 55;
 System.out.println(count > 10);

 int currentNumber = 55;
 System.out.println(count == currentNumber);

 int speedLimit = 55;
 int currentSpeed = 60;
 
 //check if current speed is more than speedlimit
 System.out.println(currentSpeed > speedLimit);
 
 //print if current speed is less than speedlimit
 System.out.println(currentSpeed < speedLimit);
 
 //print if current speed is same as speedlimit
 System.out.println(currentSpeed == speedLimit);

 int num1 = 10;
 int num2 = 20;
 boolean comp =num1 >= num2;
 System.out.println(comp);

 
 }
}
