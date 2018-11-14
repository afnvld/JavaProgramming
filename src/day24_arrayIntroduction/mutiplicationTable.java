package day24_arrayIntroduction;

public class mutiplicationTable {

	public static void main(String[] args) {
		//i is for inner
		for (int i =1; i<=10; i++) {
//			System.out.println("\t" + i);
//			System.out.println("----------------");
//			//j is outer
		for (int j = 1; j<=10; j++) {
			int result = i*j;
		System.out.print ("|   " + j + " x " + i + " = " + result + "\t  | " );
	   //System.out.print (" |  " + j + " x " + i + " = " + i*j + "\t  | " );
}
		
		}
		System.out.println("\n");
		System.out.println("------------------------------------------"
				+ "-----------------------------------------"
				+ "-------------------------------------------------");
		
		for (int i1 =1; i1<=10; i1++) {
		for (int j1 = 6; j1<=10; j1++) {
			int result2 = i1*j1;
		System.out.print ("|   " + j1 + " x " + i1 + " = " + result2 + "\t  | " );
	   //System.out.print (" |  " + j + " x " + i + " = " + i*j + "\t  | " );
			}
		System.out.println("------------");
			
		
	}
}
}

	


