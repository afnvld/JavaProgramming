package day24_arrayIntroduction;

public class PrintArrayValues {
 public static void main(String[]args) {
	 //create an array cars and dirctly assign following values
	 //audi, bmw, maseratti, ferrari, porsche, tesla
	 
	 String[] cars;
	 cars = new String[] {"Audi", "Porsche", "BMV", "Toyota", 
			 "Honda", "Tesla", "Dodge","Kia", 
			 "Acura", "Fiat", "Ford", "Lambo"};
	 //print number of cars
	 System.out.println(cars.length);
	 
	 int i = 0;
	 System.out.println(cars[i]);
	 i++;
	 System.out.println(cars[i]);
	 i++;
	 System.out.println(cars[i]);
	 
	 //print all values using a for loop
	 for (int idx =0; idx < cars.length; idx++) {
		 System.out.println(cars[idx]);
		 
	 }
	 
	 //print all values using for each loop
	 
	 for (String car : cars ) {
		 System.out.println(car);
	 }
	 
	 
	 int [] nums = {1,2,3,5,6,7};
	 for(   int n : nums){
	     System.out.println(n);
	 }

 }
}
