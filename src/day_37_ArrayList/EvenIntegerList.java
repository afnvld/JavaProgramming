package day_37_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenIntegerList {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Please enter num: " + (i + 1) + ": ");
			
			int number= input.nextInt(); // String ...... +"";
			if(number % 2 ==0) {
				nums.add(number);
			}
		}
		System.out.println(nums);
	}

}
