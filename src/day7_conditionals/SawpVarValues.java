package day7_conditionals;

public class SawpVarValues {
 public static void main(String[] args) {
	  /*
	   * Swap variable values:
	   * int num1=100;
	   * int num2=200;
	   */
	 int apples = 1;
	 int oranges = 2;
	 
//	 apples = oranges; did not work
//	 oranges = apples;
	 
	 int tempContainer = apples;
	 apples = oranges;
	 oranges = tempContainer;
	 
	 System.out.println("Oranges: " + oranges + "|apples: " + apples);

	 
 }
}
