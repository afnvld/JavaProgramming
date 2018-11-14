package interview_coding;

public class FedResBankIntQuest {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 5 };
		System.out.println(avgg(arr1));
		String st = "12:54:48";
		System.out.println(" Seconds: " + takesStr(st));
		String sent = "I love my Fort Mayers";
		String word = "my";
		System.out.println(takeout(sent, word));
	}

	public static int avgg(int[] arr) {
		int sum = 0;
		int len = arr.length;
		int avg = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		avg = sum / len;

		return avg;
	}

	public static int takesStr(String str) {
		String[] arr = str.split("\\D");// regex ->a non digit[^0-9]-> excluding digit or (":")
		int total = 0;
		int hour = Integer.parseInt(arr[0]);
		int min = Integer.parseInt(arr[1]);
		int sec = Integer.parseInt(arr[2]);
//		hour = (hour * 60) * 60;
//		min = (min * 60);
//		total = hour + min + sec;
		total = ((hour * 60 + min) * 60) + sec;
		return total;
	}

	public static String takeout(String strr, String st2) {
//		strr= strr.replaceAll(st2, "").replaceAll("\\s+", " ");--> removes one or more white space character (tab etc)
		String[] arr = strr.split(" ");
		String empty = "";
		for (int i = 0; i < arr.length; i++) {
			if (!arr[i].equalsIgnoreCase("my")) {
				StringBuilder sb = new StringBuilder();
				sb.append(arr[i] + " ");
				empty += sb.toString();
			}
		}
		return empty;//return strr;
	}
	
	

}
