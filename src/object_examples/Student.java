package object_examples;

public class Student {
	String name;
	String lastName;
	int age;
	boolean attendance;
	public static int count;

	public Student() {
		count++;
	}
	
	public Student(String name) {
		this.name = name;
		count++;
	}

	public Student(String lastName, int age) {
		this.lastName = lastName;
		this.age = age;
		count++;
	}

	public String toString() {
		return String.format("%s, %s, %d, %b", name, lastName, age, attendance);
	}
}
