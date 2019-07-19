package com.corejava;

public class ArrayAdd {
	public static void main(String args[]) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int b[][] = { { 11, 22, 33 }, { 44, 55, 66 }, { 77, 88, 99 } };
		int c[][] = new int[3][3];
		System.out.println("Adition");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				c[i][j] = a[i][j] + b[i][j];

				System.out.print(c[i][j] + " ");

			}
			System.out.println();
		}

		System.out.println("---------------");
		System.out.println("Multiplication ");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				c[i][j] = a[i][j] * b[i][j];
				System.out.print(c[i][j] + " ");

			}
			System.out.println();
		}

		System.out.println("---------------");
		System.out.println("Matrix Multiplication ");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					c[i][j]+= a[i][k] * b[k][j];}
					System.out.print(c[i][j] + " ");

				}
				System.out.println();
			}
		}
	}
