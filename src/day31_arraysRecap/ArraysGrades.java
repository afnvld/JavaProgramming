package day31_arraysRecap;

import java.util.Arrays;

public class ArraysGrades {

	public static void main(String[] args) {

		int [] grades = {13,23,45,67,88,76,99,87,65,1,500};
//		Arrays.sort(grades);
//		System.out.println(Arrays.toString(grades));
		int minGrade = grades[0];
		int maxGrade = grades[0];
		
		for (int i =0; i < grades.length; i ++) {
			if (maxGrade < grades[i]) {
				maxGrade = grades[i];
			}
			if (minGrade > grades[i]) {
				minGrade = grades[i];
			}
		}
		System.out.println("Min grade: " + minGrade);
		System.out.println("Max grade: " + maxGrade);
		
		 
	}

}
