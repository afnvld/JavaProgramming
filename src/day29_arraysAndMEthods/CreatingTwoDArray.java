package day29_arraysAndMEthods;

import java.util.Arrays;
import java.util.Random;

public class CreatingTwoDArray {

	public static void main(String[] args) {
	
		Random random = new Random();
		System.out.println(random.nextInt(100));

		//1. create 2 d array of numbers with the size of 
		// outer array =4, inner 3,7,7,
		int [][] numbers = new int [4][];
		numbers [0] = new int [5];
		numbers [1] = new int [3];
		numbers [2] = new int [7];
		numbers [3] = new int [7];
		// iterating big 4 boxes, from 0 to 3
		for (int i= 0; i<numbers.length; i++) {
		
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.println("i: " + i + "\t+j: " + j);
				numbers[i][j]= random.nextInt(100);
			}
		}
		//assign a value to an arrays---> assign random integers
		//for(int i =0; i <numbers.length; i++) {
			//print out in the following format:
			// [el2, el2,el3...]
		for(int[] inner : numbers) {
		System.out.println(Arrays.toString(inner));	
			
		}
		
	}
	}
