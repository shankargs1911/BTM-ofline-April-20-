package com.xworkz.object_class_method.finalize;

public class FinalizeTest {

	public static void main(String[] args) {
	Biriyani b=new Biriyani(10.00,"shankar");
	b=null;
	System.gc();
	
	System.out.println(b);
	}

}
