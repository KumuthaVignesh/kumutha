package com.corejava;

public class ArraySmallest {
	public static void main(String args[]) {
		int temp;
		int array[] = { 10, 20, 25, 63, 96, 57, 6, 5 };

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Smallest element of the array is:: " + array[0]);
		System.out.println("Second Smallest element of the array is:: " + array[0 + 1]);

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Largest element of the array is:: " + array[0]);
	}

}
