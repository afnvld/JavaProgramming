package day_40_class_objects;

public class Student {
	String name;
	int age;
	String email;

	public void read() {
		System.out.println("Student " + name + " is reading.");
	}

	public void read(Book nameOfBook) {
		System.out.println("Student " + name + " is reading " + nameOfBook.title + " by " + nameOfBook.author);
	}
}
