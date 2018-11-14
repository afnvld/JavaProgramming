package object_examples;

public class Car implements ElectricCar, HybridCar {
	public void drive() {
		System.out.println("Porche is driving");
	}

	public String makeSound() {
		return "beep beep";
	}

	public void stop() {
		System.out.println("porche stops");
	}

	public int getMileage() {
		return 5000;
	}
	
	public void charging() {
		System.out.println("I'm charging");
	}
	
	public void silentStart() {
		System.out.println("I'm starting silently");
	}

}
