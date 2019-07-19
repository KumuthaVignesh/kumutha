package com.corejava2;

public class Oops_prog extends Dept implements UniversityEx {
	public void study() {
		System.out.println("Hello");
	}

	public void exam() {
		System.out.println("haaaai");
	}

	public static void main(String args[]) {
		Oops_prog o = new Oops_prog();
		o.db1();
		o.study();
		o.exam();
		o.setName("SBU");
		o.setAddress("chennai");
		o.setTotal(10000);
		o.csecode(123, 121);
		System.out.println(o.getName() + " " + o.getAddress() + " " + o.getTotal());
	}
}
