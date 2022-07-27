package com.xworkz.InstanceOf;

public class Shankar {

	void mouth(Sweet sweet) {
		if (sweet instanceof Champakali) {
			System.out.println("waw.....I got Champakali");
		}
		else if(sweet instanceof Jilebi) {
			System.out.println("Waw..... I got Jilebi");
		}
		else {
			System.out.println("ohh.... I did not get any sweet");
		}
	}
}
