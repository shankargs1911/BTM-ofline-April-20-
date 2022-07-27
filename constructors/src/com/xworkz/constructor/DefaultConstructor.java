package com.xworkz.constructor;

public class DefaultConstructor {

	public static void main(String[] args) {
		
		Gun gun = new Gun(1, 1.5,"black");
		Gun gun2 = new Gun(6, 1.2, "Red");
		
		System.out.println("Gun Details:");
		System.out.println("noOfBullet :"+ gun.noOfBullet);
		System.out.println("weight :"+gun.weight);
		System.out.println("color :"+gun.color);
	
		System.out.println("Gun Details2");
		System.out.println("noOfBullet :"+gun2.noOfBullet);
		System.out.println("weight :"+gun2.weight);
		System.out.println("color :"+gun2.color);
	}

}
