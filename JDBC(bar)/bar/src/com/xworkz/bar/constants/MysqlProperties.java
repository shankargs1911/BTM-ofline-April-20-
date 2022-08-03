package com.xworkz.bar.constants;

public enum MysqlProperties {
	URL("jdbc:mysql://localhost:3306/bar"), USERNAME("root"), SECRET("Sh@9740739746");

	private String value;

	private MysqlProperties(String value) {
	this.value=value;
	}
	public String getValue() {
		return value;
	}
}