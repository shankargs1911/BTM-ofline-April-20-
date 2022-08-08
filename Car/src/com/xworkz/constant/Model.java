package com.xworkz.constant;

public enum Model {
	Toyota_Fortuner("toyota fortuner"), Tata_Harrier("Tata harrier"), Maruti_Dzire("maruti dzire"),
	Maruti_Baleno("maruti baleno"), DEFAULT("default");

	public String model;

	private Model(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;

	}

	public static Model getByValue(String value) {
		Model[] model = Model.values();
		for (Model model1 : model) {
			if (model1.model.endsWith(value)) {
				return model1;

			}
			return null;

		}
		return null;
	}

}
