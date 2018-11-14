package day_41_constructor;

public class Car {
	String make;
	int year;
	boolean sportEdition;
	int mileage;

	public void drive() {
		System.out.println(year + " " + make + " is driving");
		mileage += 10;
	}

	public void drive(String destination) {
		System.out.println(year + " " + make + " is driving to " + destination);
		mileage += 10;
	}

	public void drive(int mile) {
		System.out.println(year + " " + make + " is driving" + mile + " miles");
		mileage += mile;
	}
	
	
}
