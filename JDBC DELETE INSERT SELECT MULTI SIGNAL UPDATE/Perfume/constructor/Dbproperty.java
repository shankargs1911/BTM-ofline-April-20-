package com.xworkz.Perfume.constructor;

public enum Dbproperty {
	URL("jdbc:mysql://localhost:3306/lipstick"), USERNAME("root"), PASSWORLD("Sh@9740739746");

	private String value;

	private Dbproperty(String val) {
		this.value = val;

	}
	public String getValue() {
		return value;
	}
}
