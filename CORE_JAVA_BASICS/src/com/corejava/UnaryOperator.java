package com.corejava;

public class UnaryOperator {

	public static void main(String args[])
	{
	int i=12;
		System.out.println(i++);
	System.out.println(i--);
	System.out.println(i--);
		System.out.println(++i);		System.out.println(--i);
		
		int x=10;  
		System.out.println(x++); //10 (11)  
		System.out.println(++x); //12  
		System.out.println(x--); //12 (11)  
		System.out.println(--x); //10  
		}
	}