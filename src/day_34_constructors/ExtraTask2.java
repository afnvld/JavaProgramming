package day_34_constructors;

public class ExtraTask2 {

	public static void main(String[] args) {
		primeNumMethod(20);

	}
	public static int[] primeNumMethod (int bound) {
	   int temp=0;
	   for (int i=1; i < bound; i++){
			boolean isPrime =false;
		   for(int j =1; j< bound; j++) {
				if (i==j) {
					if(i%1 == 0 && i%i == 0 && i%j > 0) {
						isPrime = true;
						
					}
				}
					
			}
			if(isPrime ==true) {
			System.out.println(i);
				
			}
		}
		return null;
//	    for (int i = 0; i < bound; i++) {
//	    	n=1;
//	        if (isPrime(n) == True) {
//	            arr[i] = n;
//	            n++;
//	        } else {
//	            n++;
//	        }
	}
	}


