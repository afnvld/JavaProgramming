package homeWork;
import java.util.Arrays;
public class ZombieTask1 {
	public static void main(String[] args) {
		
        int[] population = {3,6,0,4,3,2,7,1};
        System.out.println(Arrays.toString(population));
           for(int days =0; days< population.length; days++) {
       	  while (population[days]> 0) {
        		 
        			  for (int city =0; city< population.length; city++) {
        				  population[city] = population[city] /= 2;
        				  
        			  
        		  }
        			  System.out.println(Arrays.toString(population));
        	  }
           }
           
           
	}

}
