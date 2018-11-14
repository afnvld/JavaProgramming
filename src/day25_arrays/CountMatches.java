package day25_arrays;

public class CountMatches {

	public static void main(String[] args) {
		//create a double array called prices 
		/*assign 10 or more different prices 
		 * using a loop count how many items that is more than 20$
		 * print the count 
		 */
		
 double prices[]={10, 3, 4.50, 23, 14, 34, 234, 1, 2, 3};
 int count = 0;
 for (double price : prices) {
	 if(price>20.0) {
		 count++;
	 }
	 
 }
 if (count == 0) {
	 System.out.println("no items more that $20");
	 
 }else {
	 System.out.println(count + " items more that $20"); 
	 
 }
 

	}

}
