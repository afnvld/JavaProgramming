package day28_arrays;

import java.util.Arrays;

public class CopyOfMurodil {

	public static void main(String[] args) {
		
			int[] a = {10,20,30};
			int[] b = Arrays.copyOf(a, 2);
			
			System.out.println(Arrays.toString(b));
			
			int[] c = Arrays.copyOf(a, 5);
			System.out.println(Arrays.toString(c));
			
			System.out.println("--------------");
			System.out.println(Arrays.toString(a));
			
			a = Arrays.copyOf(a,4);
			
			System.out.println(Arrays.toString(a));
			a[3] = 100;
			
			System.out.println(Arrays.toString(a));
			
		 

		}
	}
		

