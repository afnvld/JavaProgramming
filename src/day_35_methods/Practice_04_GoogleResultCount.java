package day_35_methods;

public class Practice_04_GoogleResultCount {

	public static void main(String[] args) {
		String something = "About 691,000,000 results (0.78 seconds)";
		System.out.println(resultCount(something));
		System.out.println(resultTime(something));
	}
	
	
	public static String resultCount (String str) {
		String[] word = str.split(" ");
		String withComma = word[1];
		String withNoComa= word[1].replaceAll(",", "");
		
		
			return withNoComa;
		}
	
	public static String resultTime (String strr) {
//		String [] splitArr = strr.split("\\(");
//		String secondPart = splitArr[1]; //0.74 seconds
//		String wopsecondPart = secondPart.replace(")", "");
//		return wopsecondPart;
		String[] word2 = strr.split(" ");
		String with1 = word2[3].replaceAll("\\(", "");
		String with2 = word2[4].replace(")", "");
		String withComma = with1+" "+with2;
		
		
		
			return withComma;
		}
	}
		
	


