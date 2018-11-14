package day21_practice;

public class Continue {

	public static void main(String[] args) {
		for(int k=0; k<= 10; k++) {
			if (k== 3 || k== 5) {
				continue;
			}
			System.out.println("Value of 'k':" +k);
		}
	}

}
