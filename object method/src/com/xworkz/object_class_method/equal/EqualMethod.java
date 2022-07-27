package com.xworkz.object_class_method.equal;

public class EqualMethod {

	public static void main(String[] args) {
		Ac lg=new Ac("lg","red",50.0);
		Ac samsung=new Ac("samsung","green",9000.0);
		
		System.out.println(lg.equals(samsung));
	}

}
