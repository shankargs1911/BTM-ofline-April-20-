package com.xworkz.constant;

public enum Designation {

	SOFTWAREDEVELOPER("developer"), SOFTWARETESTER("tester"), MANAGER("reporting manager"), TEAMLEAD("TL"),
	ARCHITECT("head");

	private String value;

	private Designation(String value) {
		this.value = value;
	}

	public String getDesignation() {
		return value;
	}

}
