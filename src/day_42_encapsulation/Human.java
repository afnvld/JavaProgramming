package day_42_encapsulation;

public class Human {
	private String gender;
	private int age;
	static String todaysDate;

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public void setGender(String gender) {
		if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")) {
			this.gender = gender;
		}
	}

	public void setAge(int age) {
		if (age >= 0 && age <= 150) {
			this.age = age;
		}
	}

}
