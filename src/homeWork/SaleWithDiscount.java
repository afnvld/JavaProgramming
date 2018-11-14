package homeWork;

import java.util.Scanner;

public class SaleWithDiscount {
 public static void main(String[] args) {
	
	 Scanner scan = new Scanner (System.in);
	
		/*
		 * less < 100 --> 0%
		 * 100-120 --> 10%
		 * more > 120 --> 15%
		 */

			
	System.out.println("Enter your price: ");
	int unitPrice = scan.nextInt();
			
	System.out.println("Enter your quantity: ");
	int quantity = scan.nextInt();
			
	double output = 0.0;
			
	if(quantity >= 100 && quantity < 120) {
	output = unitPrice*quantity;
	System.out.println("Grand Total: $" + output);
	System.out.println("Discount: 10%");
	
	}else if(quantity >= 120) {
	output = unitPrice*quantity;
	System.out.println("Grand Total: $" + output);
	System.out.println("Discount: 15%");
				
	}else if(quantity < 100) {
	output = unitPrice*quantity;
	System.out.println("Grand Total: $" + output);
	System.out.println("Discount: 0%");
			}
			
		scan.close();

		}

	}
