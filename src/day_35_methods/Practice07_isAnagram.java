package day_35_methods;

import java.util.Arrays;

public class Practice07_isAnagram {

	public static void main(String[] args) {
		String firstWord ="march";
		String secondWord = "charm";
		System.out.println(isAnagram(firstWord, secondWord));

	}
	
	public static boolean isAnagram(String one, String two) {
		
		if(one.length() != two.length()) {
			return false;
		}else {
			char [] oneArr =one.toCharArray();//['m', 'a', 'r', 'c', 'h']
			char [] twoArr= two.toCharArray();//['h', 'c', 'r', 'a', 'm']
			Arrays.sort(oneArr);//[a,c,h,m,r]
			Arrays.sort(twoArr);//[a,c,h,m,r]
			for(int i =0; i< one.length(); i++) {
				if(oneArr[i]!=twoArr[i]) {
					return false;
				}
			}
			return true;
		}
		
	}

}
