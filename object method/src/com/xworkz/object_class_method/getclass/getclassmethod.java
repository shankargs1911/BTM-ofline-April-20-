package com.xworkz.object_class_method.getclass;

import com.xworkz.object_class_method.tostring.Window;

public class getclassmethod {
	public static void main(String[] args) {
		Window window=new Window("Glass", 90.00, 50.00);
		
		System.out.println(window.getClass().getSimpleName());
	}
}
