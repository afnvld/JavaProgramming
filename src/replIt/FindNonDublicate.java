package replIt;

public class FindNonDublicate {

	public static void main(String[] args) {
	int []nums = {1, 1, 2, 3, 4, 3, 4};
	for(int i=0; i< nums.length; i++) {
		boolean flag = false;
		int temp = nums[i];
		for(int j=0; j < nums.length; j++) {
			if(j != i) {
				if (temp == nums[j]) {
					flag = true;
				}
			} 
		}
		if (flag == false) {
			System.out.println(temp);
		}
	}


}
}
	
		
 

