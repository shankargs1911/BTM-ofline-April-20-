package com.xworkz.MethodOverloading;

public class speakerrunner {
	public static void main(String[]args) {
		
		speak sp =new speak();
		Friend fr = new Friend();
		unknown un =new unknown();
		sp.talk(fr);
		sp.talk(un);
		
	}
}
