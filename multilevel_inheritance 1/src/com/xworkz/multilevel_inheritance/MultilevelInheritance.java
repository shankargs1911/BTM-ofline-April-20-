package com.xworkz.multilevel_inheritance;

public class MultilevelInheritance {
	public static void main(String[] args) {

		Bird bird = new Bird();
		BabyLoveBird babyLoveBird = new BabyLoveBird();
		LoveBird loveBird = new LoveBird();

		babyLoveBird.fly();
		babyLoveBird.Play();
		babyLoveBird.Sing();

	}

}