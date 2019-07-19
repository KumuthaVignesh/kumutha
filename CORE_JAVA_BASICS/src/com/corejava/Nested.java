package com.corejava;

public class Nested {
	public static void main(String args[]) {
		int i = 5;

		if ((i >= 70) && (i < 95)) {
			System.out.println("First class");
		}

		if ((i >= 50) && (i <= 70)) {
			System.out.println("Second Class");
		}
		if (i < 35) {
			System.out.println("Third Class");
		} else {
			System.out.println("Fail");
		}
	}
}
