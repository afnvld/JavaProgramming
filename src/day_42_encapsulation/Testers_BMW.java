package day_42_encapsulation;

import java.util.Arrays;

public class Testers_BMW extends BMW {

	public Testers_BMW(String model, int year) {
		super(model, year);

	}

	public static void main(String[] args) {
		BMW car = new BMW("x3", 2016);

		car.setColor("red");
		System.out.println(car.getColor());
		car.setYear(1907);
		System.out.println(BMW.totalCars);
		System.out.println(car.getYear());
		wash(car);
	}

}
