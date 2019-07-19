package com.Oops;

public class CustomMain {
	static void validate(int age) throws CustomExceptions {
		if (age < 18)
			throw new CustomExceptions("not valid");
		else
			System.out.println("welcome to vote");
	}

	// Driver Program
	public static void main(String args[]) {
		try {
			validate(13);
		} catch (Exception m) {
			System.out.println("Exception occured: "+m);
		}

		finally
		{
			System.out.println("hi");
		}
	}
}
