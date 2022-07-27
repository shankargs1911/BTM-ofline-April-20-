package com.xworkz.object_class_method.finalize;

public class Biriyani {
	String type;
	double price;

	public Biriyani(double price, String type) {
		this.type = type;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Biriyani [type=" + type + ", price=" + price + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}
