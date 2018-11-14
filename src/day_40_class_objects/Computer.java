package day_40_class_objects;

public class Computer {
	String model;
	String color;
	int size;
	int memory;
	boolean newComp;

	public void turnOn() {
		System.out.println("Computer turning on");
	}
	public void turnOff() {
		System.out.println(model + "turning off");
	}
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString();
//	}
}
