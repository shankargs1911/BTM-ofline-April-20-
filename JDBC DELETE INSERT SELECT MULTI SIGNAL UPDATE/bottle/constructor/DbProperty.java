package com.xworkz.bottle.constructor;

public enum DbProperty {
	URL("jdbc:mysql://localhost:3306/lipstick"), USERNAME("root"), PASSWORLD("Sh@9740739746");

	private String value;

	private DbProperty(String val) {
		this.value = val;
	}
	public String getvalue() {
		return value;
		
	}
}
