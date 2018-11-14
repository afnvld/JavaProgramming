package day9_conditionals3;

import java.util.Scanner;

public class TollCalculator {
  public static void main(String[] args) {
	  /* 0 - 100 -> $5
	   * 101-500 --> $8
	   * 501-1000 --> $10
	   * more than 1000 -> $12
	   */
	
	Scanner scan = new Scanner(System.in);
	System.out.println("----TOLL COST CALCULATOR APP----");
	System.out.println("Enter disctance you will drive");
	
	int miles = scan.nextInt();
	double tollCost = 0.0;
	
	if(miles >= 0 && miles <= 100) {
		tollCost = 5.0;
	}else if(miles >= 101 && miles <= 500) {
		tollCost = 8.0;
	}else if (miles >= 501 && miles <= 1000) {
		tollCost = 10.0;
		
	}else if (miles >= 1000) {
		tollCost = 12.0;
	}else {
		System.out.println("Cannot be negative disctance");
	}
	
	  System.out.println("Toll cost for " + miles + "miles - $" + tollCost);
  }
}
