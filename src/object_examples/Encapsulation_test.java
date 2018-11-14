package object_examples;

public class Encapsulation_test {
	public static void main(String[] args) {

		HelloWorld myObject = new HelloWorld("utopia", 4);
		myObject.setEmailAddress("adina@mail.com");
		System.out.println(myObject.getEmailAddress());
		myObject.getEmailAddress();

	}
}
