package com.exception;

public class ExceptionNull {

	public static void main(String[] args) {
		int a = 10, b = 5;
		int c = a + b;
		System.out.println("Addition of 2 Numbers is" + c);
		try {

			String s = "ONESOFT";
			System.out.println("String s length is"+s.length());

			String s1 = null;
			System.out.println(s1.length());
			System.out.println(s1);
		}

		catch (NullPointerException N) {
			System.out.println("Nullpointer Exception are" + N);
		} 
		finally {
			System.out.println("Inside the finally block");
		}
	}
}
