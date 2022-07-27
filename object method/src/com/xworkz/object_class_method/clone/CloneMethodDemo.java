package com.xworkz.object_class_method.clone;

public class CloneMethodDemo {

	public static void main(String[] args) {
		Soap santoor = new Soap("Santoor", 10.00, "orange");
		Soap CopyOfSantoor = null;
		try {
			CopyOfSantoor = santoor.copy();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println(santoor == CopyOfSantoor);
		System.out.println(santoor);
		System.out.println(CopyOfSantoor);
	}

}
