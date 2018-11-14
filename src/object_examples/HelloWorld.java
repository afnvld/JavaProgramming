package object_examples;

public class HelloWorld {
	// declaring variable as private
	private String emailAddress;
	public static String username1;
	public int password;
	public int length;

	public HelloWorld(int password) {
		this.password = password;
	}
	public HelloWorld(String username1,int length) {
		HelloWorld.username1= username1;
		this.length= length;
	}

	// writing public method to get value
	public String getEmailAddress() {
		return emailAddress;

	}

	// public method to set email--> give value
	public void setEmailAddress(String email) {
		if (email.indexOf("@") != -1) {
			this.emailAddress = email;
		} else {
			throw new IllegalArgumentException("Invalid email address");
		}
	}
}
