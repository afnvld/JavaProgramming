package day_39_customClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ObjectExample {

	public static void main(String[] args) {

		String s = " James";
		Random r = new Random();
		Iphone myPhone = new Iphone();
		myPhone.model = "iPhone 8 Plus";
		myPhone.color = "Pink";
		myPhone.memory = 128;
		System.out.println(myPhone.memory);
		System.out.println(myPhone.color);
		//System.out.println(myPhone);//- shows a location where object is stored
		
		Iphone jamasIphone = new Iphone();
		System.out.println(jamasIphone.model);
		jamasIphone.model= "Iphone XS max";
		jamasIphone.color="Gold";
		jamasIphone.memory=64;
//		System.out.println(jamasIphone.model);
//		System.out.println(myPhone.model);
		myPhone= jamasIphone;
		
		jamasIphone.printPhoneInfo();
		System.out.println();
		myPhone.printPhoneInfo();
		
		List<Iphone> phones = new ArrayList<>();
		phones.add(myPhone);
		phones.add(jamasIphone);
		for(Iphone i :phones) {
			System.out.println(i.model);
		}
	}

}
