package day_42_encapsulation;

public class BMW {
	private String model;
	private int year;
	private String color;
	private int price;
	static int totalCars;

	public void drive() {
		System.out.println(model + " is driving");
	}

	public void stop() {
		System.out.println(model + " is stopping");
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public String getColor() {
		return color;
	}

	public int getPrice() {
		return price;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setYear(int year) {
		if (year >= 1900 && year <= 2018) {
			this.year = year;
		} else {
			System.out.println("invalid year");
		}
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPrice(int price) {
		if (price >= 0 && price <= 1000000) {
			this.price = price;
		}
	}

	public BMW(String model, int year) {
		this.model = model;
		this.year = year;
		totalCars++;
	}

	static void wash(BMW car) {

		System.out.println(car.model + " is washed");
	}
	
}
