package homeWork;

import java.util.Arrays;

public class ZombieTask2 {

	public static void main(String[] args) {
		
int [] population = {3447,6,0,4,3,2,2,0};

 System.out.println(Arrays.toString(population));
	
	for (int days = 0; days < population.length; days ++) {
		while (population[days]>0) {
			for (int city =0; city < population.length; city++) {
				if (population[city] == 0) {
					if(city == 0) {
						population [city+1] = population [city+1] /2;
					}else if (city == population.length -1 ) {//7 indexes, but 8 cities, thats why -1
						population[city-1] = population[city-1]/2;
	
					}else {
						population[city+1] = population[city+1]/2;
						population [city-1] = population [city-1] /2;
					}
				}
			}
			System.out.println(Arrays.toString(population));
		}

	   }
	}
}