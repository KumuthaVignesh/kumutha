package com.exception;

public class ExceptionMethod {

	public static void main(String args[]) {
		try {
			int d = 0;
			int n = 20;
			int f = n / d;
			System.out.println(f);
		} catch (ArithmeticException e) {
			System.out.println("In the catch clock due to Exception");
			System.out.println("In the catch clock due to Exception = " + e);
		} finally {
			System.out.println("Inside the finally block");
		}
	}
}
