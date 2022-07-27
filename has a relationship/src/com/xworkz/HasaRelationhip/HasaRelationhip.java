package com.xworkz.HasaRelationhip;

public class HasaRelationhip {
	public static void main(String[]  args) {
		libeary libeary = new libeary();
		libeary.Student = new Student();
		libeary.Student.id = "01";
		libeary.Student.name = "Rajkumar";
		libeary.Student.branch ="EC";
		libeary.name ="sharada";
		libeary.location = "Bangalure";
		
		System.out.println("library Name :"+ libeary.name);
		System.out.println("library location : "+libeary.location);
		System.out.println("student id :"+ libeary.Student.id);
		System.out.println("student name :"+ libeary.Student.name);
		System.out.println("student branch :"+ libeary.Student.branch);
	
	}
}
