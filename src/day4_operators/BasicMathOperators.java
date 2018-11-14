package day4_operators;

public class BasicMathOperators {
public static void main(String[] agrs) {
	//create 2 int variables and assign values
	int num1 = 100;
	int num2 = 200;
	System.out.println(num1+num2);//300
	System.out.println(num1+num2 +1000);//1300
    int sum = num1 + num2 + 10;
    System.out.println("Sum is " + sum);
    
    //create 3 variables: apples, carrots, tomatoes
    // add prices to it with decimals
    // create a variable called total and assign total price
    //also print the tax then add the task to the total
    //print your total is total price with tax
    //6
    double apples = 10.55;
    double carrots = 3.87;
    double tomatoes = 6.23;
    
    double totalBeforeTax = apples + carrots + tomatoes;
    System.out.println("Total Before Tax: " + totalBeforeTax);
    //calculate tax
    double tax = totalBeforeTax * 0.06; 
    System.out.println("Total tax: " + tax);
    
    double grandTotal = totalBeforeTax + tax;
    System.out.println("Your total is $ " + grandTotal);
    
 }
}
