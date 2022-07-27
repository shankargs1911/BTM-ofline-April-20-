package com.xworkz.methodoverriding;

public class methodoverriding {

	public static void main(String[] args) {
			RBI rbi = new RBI();
			HDFC hdfc = new HDFC();
			AXIS axis = new AXIS();
			
			rbi.interestrate();
			hdfc.interestrate();
			axis.interestrate();
	}

}
