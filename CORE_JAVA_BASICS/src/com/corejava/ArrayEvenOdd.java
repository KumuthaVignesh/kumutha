package com.corejava;

public class ArrayEvenOdd {
	public static void main(String args[]) {
		int arr[] = { 11, 22, 33, 4, 5, 6 };
		int even = 0, odd = 0;

		System.out.println("Find Even Odd Numbers in the Array");

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				System.out.println("Even Numbers in the Array" + arr[i]);
			}

			else {
				System.out.println("Odd Numbers in the Array" + arr[i]);
			}
		}

		System.out.println("--------------------------");

		// Loop to find even, odd sum
		System.out.println("Loop to find even, odd sum");
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0)
				even += arr[i];
			else
				odd += arr[i];
		}

		System.out.println("Even index positions sum: " + even);
		System.out.println("Odd index positions sum: " + odd);

	}
}
