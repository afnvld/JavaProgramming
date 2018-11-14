package day9_conditionals3;

public class RangeTests {
public static void main(String[] args) {
	
	int students = 10;
	//check if students is more than 5 and less than 30
	//print :"let's do mentoring session"
	//students more then or equal to 30 and less than 60
	//print :"let's have a lecture"
	//if more than 60; print: "students need to take class online"
	
	if(students >= 5 && students < 30) {
		System.out.println("Let's do mentoring session");
	}else if (students >= 30 && students <= 60) {
		System.out.println("Let's have a lecture");
	}else if (students > 60) {
		int online = students - 60;
		System.out.println(online + "students need to join class online");
	}else {
		
	}
}
}
