package day5_operators;

public class ShortHandOperators {
	/*
	 * +=; -=; 
	 */
  public static void main(String[] args) {
	  int count = 100;
	  count = count + 1;//101
	  
	  System.out.println(count);
	  //add 10 to count , sme way
	  count =count + 10;
	  System.out.println(count);
	  
	  count += 10;
	  System.out.println(count);
	  
	  count = 15;
	  count *= 2;
	  count = count * 2;
	  System.out.println(count);
	  count /= 5; //60 / 5 --. 12
	  System.out.println("After /= " + count);
	  
	  count %= 5; //12 / 5 --> 0
	  System.out.println(count);
	  
	  double price = 14.4;
	  price /= 2;
	  System.out.println(price);
	  
  }
}
