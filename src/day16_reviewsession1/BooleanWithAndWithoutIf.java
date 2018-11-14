package day16_reviewsession1;

public class BooleanWithAndWithoutIf {
 public static void main(String[] args) {
		/*
		 * <,<= , >, >= , !=, ==
		 * &&, ||, !, ^
		 * &   && (short circuit)
		 * & will test both conditions all the time
		 * && will not test both conditions if first one is false
		 * 5 > 6 & 4 > 5 -> false
		 * 5 > 6 && 4 > 5 -> false, and will not test second condition
		 * 6 > 3 && 4 > 5 -> false, will test both. Because first is true and second one
		 * 	needs to be tested as well.
		 * 
		 * |   || (short circuit)
		 * false | true - > true
		 * 5 > 6 || 4 > 5 -> false
		 * 6 == 6 || 3 == 1 -> true and (3 == 1) will not be tested
		 */
		
		boolean b = 12 > 10;
		System.out.println(b);
			 //true     true
		b = 12 > 10 && 10 < 15;
		System.out.println(!!!!!!!!!!!b);
		b = !b;
		System.out.println(b);
		 // 22100 -- 22200 -> Mclean
		int zipCode = 22099;
		           
		if(zipCode >= 22100  && zipCode++ <= 22200) {
			System.out.println("McLean");
		}else {
			System.out.println("Not McLean");
		}
		
		System.out.println(zipCode);
		
		double budget = 500;
		
		double phone = 250.0;
		double watch = 105.5;
		double bag = 80.0;
		
		//-> 1000
		
		
		
	}
}
