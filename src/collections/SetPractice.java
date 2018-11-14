package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class SetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> states = new HashMap<Integer, String>();
		Set<Integer> numbers = new HashSet<Integer>();
		
		states.put(1, "Illinois");
		states.put(2, "New York");
		states.put(3, "Nebraska");
		states.put(4, "VIrginia");
		System.out.println(states.values());
		System.out.println(states.keySet());
		
		numbers.add(2);
		numbers.add(3);
		numbers.add(5);
		numbers.add(5);
		System.out.println(numbers);
	}

}
