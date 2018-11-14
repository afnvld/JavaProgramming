package day5_operators;

public class CastingPrimitives {
 public static void main(String[] args) {
	 
	int i = 100;
	byte b = (byte)i;	 
	//casting is to convert one type of primitive to other
	//whenever we need to assign larger type value to smaller one, we need so cast it/covert it
	//with ()
	
	
	double price = 12.5;
	int price2 = (int)price;
	
	System.out.println(price2);
	
	//implicit casting examples:
	int count = 4556;
	double doubleCount = count;
	System.out.println(doubleCount);
	
	byte byteValue = 127;
	int intValue = (int)byteValue; //
	
	//explicit casting
			int students = 70;
			byte byteStudents = (byte)students;
			System.out.println(byteStudents);
			//int --> byte var
			double priceOfSmth = 5343.23;
			int intPrice = (int)priceOfSmth;
			System.out.println(intPrice);//5343
			int large = 34534;
			byte small = (byte)large;
			System.out.println(small);
		
			String numStr = "2345";
			//it will be just attached, bc its a string
			System.out.println(numStr + 5 + 2);
			
			System.out.println(5/ 2.0);
			int x = (int) (5 / 2.0);
			System.out.println(x);
 }
}
