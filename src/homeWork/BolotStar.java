package homeWork;

public class BolotStar {

	public static void main(String[] args) {
		
		int rows = 15;
		int columns = 15;
		
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= columns; j++) {
				if(i == 1 || i == rows || 
				   j == 1 || j == columns ||
				   j == rows-i+1) {
					System.out.print("*");
				}else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
