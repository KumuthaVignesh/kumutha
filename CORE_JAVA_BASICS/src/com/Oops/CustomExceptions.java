package com.Oops;

//import com.Oops.Exceptions.*;

public class CustomExceptions extends Exception {
	// A Class that represents use-defined expception

	public CustomExceptions(String s) {
		// Call constructor of parent Exception
		super(s);
	}
}

// A Class that uses above MyException
