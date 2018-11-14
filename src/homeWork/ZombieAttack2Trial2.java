package homeWork;

import java.util.*;
public class ZombieAttack2Trial2 {
  public static void main(String[] args) {
	  
    Scanner input = new Scanner(System.in);
    int[] inhabitants = new int[8];
    for(int i=0; i<inhabitants.length; i++) {
      inhabitants[i] = input.nextInt();
    }
    
    //TODO. Write you code below this line. 
   
        int day = 0;
        int sum = 0;
        
        System.out.println("Day "+day+" "+Arrays.toString(inhabitants));
        
        do {
            day++;
            sum = 0;
            int[] inhabitantsTemp = Arrays.copyOf(inhabitants, inhabitants.length);
            
        for(int i = 0; i <inhabitants.length; i++) {
            if(inhabitants[i] == 0 && i != 0 && i != inhabitants.length-1) {
                inhabitantsTemp[i-1] = inhabitants[i-1]/2;
                inhabitantsTemp[i+1] = inhabitants[i+1]/2;
            }else if(i == 0 && inhabitants[i] == 0) {
                inhabitantsTemp[i+1] = inhabitantsTemp[i+1]/2;
            }else if(i == inhabitants.length-1 && inhabitants[i] == 0) {
                inhabitantsTemp[i-1] = inhabitants[i-1]/2;
            }
        }
        for(int i = 0; i< inhabitants.length; i++) {
            inhabitants[i] = inhabitantsTemp[i];
        }
        for(int inhabitant : inhabitants) {
            sum = sum+inhabitant;
        }
        
        System.out.println("Day "+day+" "+Arrays.toString(inhabitants));
        }while (sum != 0);
        
        
        System.out.println("---- EXTINCT ----");
    
  }
}