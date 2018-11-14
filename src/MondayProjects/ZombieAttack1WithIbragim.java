package MondayProjects;

import java.util.Arrays;

public class ZombieAttack1WithIbragim {

	public static void main(String[] args) {
		int[] cities = new int[]{3,6,0,4,3,2,7,1};
		int peopleAlive;
		int days = 0;
		do {
			peopleAlive = 0;
			for(int cityPopulation : cities){
				peopleAlive += cityPopulation;
			}
//			System.out.println(peopleAlive);
			System.out.println("Day : " + days + " "+ Arrays.toString(cities));
			if(peopleAlive == 0)break;
			for ( int i = 0; i < cities.length; i++){
				cities[i] = cities[i] /2;
			}
			days++;
		}while (peopleAlive > 0);

	}

}
