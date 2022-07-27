package com.xworkz.encapsulations;

public class DogTester {

	public static void main(String[] args) {
		Dog dog = new Dog();

		dog.setName("rocky");
		dog.setColor("black");
		dog.setBreed("surfy");
		dog.setAge(4);
		dog.setPrice(1000000);
		
		System.out.println("Name :" + dog.getName());
		System.out.println("Color:" + dog.getColor());
		System.out.println("Breed :" + dog.getBreed());
		System.out.println("Age :" + dog.getAge());
		System.out.println("price :" + dog.getPrice());
	}

}
