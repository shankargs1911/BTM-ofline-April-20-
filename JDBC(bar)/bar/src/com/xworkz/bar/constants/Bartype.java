package com.xworkz.bar.constants;

public enum Bartype {
	WiNESTORE("WINE STORE"), RESORT("resort"), MSIL("msil"), BARANDRESTURENT("Bar_restorent"), DEFAULT("resturent");

	private String name;

	private Bartype(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
