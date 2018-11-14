package day24_arrayIntroduction;

public class MultiplicationTable2 {

	public static void main(String[] args) {
		
		
		
//System.out.println("                      Multiplication Table                     ");
//System.out.println("***************************************************************");
//
//System.out.println(" ");
//for(int row =1; row <=12; row++ ) {
//	System.out.print(row+"  |  ");
//	for(int colon  = 2 ;colon <= 12; colon++) {
//		System.out.print(colon*row+"  |  ");
//		System.out.print("");
//	}
//	System.out.println("");
//}
//		
		System.out.println(" MULTIPLICATION TABLE");
		for (int i =0; i<=10; i++) {
			System.out.print(i+ "\t");
			
			for(int j =1; j <=10; j++) {
				if(i<1) {
					System.out.print((i +1) * j + "\t");
				}
				if (i>0) {
					System.out.print(i  * j + "\t");
				}
			}
			System.out.println("");
		}
		

	}

}
