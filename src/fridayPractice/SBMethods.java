package fridayPractice;

public class SBMethods {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder ("hello");
		
		//sb.delete(2, 4);//removes 2nd and 3rd
		sb.deleteCharAt(4);//deletes "o"
		System.out.println(sb);//heo
		
		sb.append("world");//adds 
		System.out.println(sb);//hellworld
		
		sb.insert(4, "o ");
		System.out.println(sb);//hello world--> places "o" at index 4
		
	}

}
