package com.xworkz.object_class_method.tostring;

public class Window {
	String type;
	double height;
	double width;
	
	 public Window(String type,double height,double width) {
		 this.type=type;
		 this.height=height;
		 this.width=width;
	}

	@Override
	public String toString() {
		return "Window [type=" + type + ", height=" + height + ", width=" + width + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	 
}
