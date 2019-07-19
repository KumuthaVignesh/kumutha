package com.exception;

public class ExceptionNumformat {

	public static void main(String[] args) {
		try {
			try {
				String s = "abc";
				int i = Integer.parseInt(s);
				int a[] = new int[5];
				a[4] = 50;
				int a1[] = new int[5];
				a1[10] = 50;
				System.out.println("The array value of a[4] is" + a[4]);
			}

			catch (NumberFormatException e) {
				System.out.println("NumberFormatException is" + e);
			} catch (ArrayIndexOutOfBoundsException a) {
				System.out.println("ArrayIndexOutOfBoundsException" + a);
			} finally {
				System.out.println("Inside the finally block for first try");
			}

		} finally {
			System.out.println("Inside the finally block for second try");
		}
	}

}
