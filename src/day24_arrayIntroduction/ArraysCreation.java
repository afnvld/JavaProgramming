package day24_arrayIntroduction;

public class ArraysCreation {

	public static void main(String[] args) {
		//declare array that can hold 5 items
		int[] numbers = new int[5];
		//assign values 
		//0,1,2,3,4
		numbers[0] = 234;
		numbers[1] = 432;
		numbers[2] = 100;
		numbers[3] = 54;
		numbers[4] =7654;
		
		
		System.out.println(numbers[3]);
		
		numbers [0]= 1000;
		System.out.println(numbers[0]);
		//numbers [10] will be out of exception if print 
		
		//it will add num2 to num3= 100+54=154
		numbers[1]=numbers [2]+ numbers[3];
		System.out.println(numbers[1]);
		
		//declare char array grades and assign a,b,c,d,e to it
		//use any one of three ways to do
		
		
		char[] grades= new char[] {'A','B','C','D','E'};
		char[] grades2 = new char[]{'A','B','C','D','E'};
		System.out.println(grades);
		
		char myGrade = grades[0];
		System.out.println(myGrade);
		
		char[]grades3 = new char [5];
		grades3[0]= 'A';
		grades3[1]= 'B';
		grades3[2]= 'C';
		grades3[3]= 'D';
		grades3[4]= 'E';
		
		
		
		//String[] cities = new String[3];
		String[] cities; //String cities[];
		cities= new String[3];
		 
		cities[0]= "New York";
		cities[1]= "Los Angeles";
		cities[2]= "Washington";
		

		
		
	}

}
