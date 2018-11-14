package fridayPractice;

public class FindSecondSmallest {

	public static void main(String[] args) {
		int arr[]= {44,32,4,62,7};
        int small=arr[0];
        int second=arr[0];
        
        
        for(int j=0;j<arr.length;j++) {
            if(arr[j]<small) {
                second=small;
                small=arr[j];
            } else if (arr[j] < second && arr[j] != small)
               second = arr[j];
            
        }
        
        
        System.out.println("smallest is " +small);
        
            
        System.out.println("second smallest is " +second);
        
    }
	}


