package com.xworkz.constant;

public enum Dbproperty {
	URL("jdbc:mysql://localhost:3306/bar"), USERNAME("root"), SECRET("Sh@9740739746");

	private String value;

	private Dbproperty(String value) {
	this.value=value;
	}
	public String getValue() {
		return value;
	}
}
