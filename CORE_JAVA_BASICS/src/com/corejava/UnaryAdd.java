package com.corejava;

public class UnaryAdd {
	public static void main(String args[])
	{
		int a=10,b=8;
		System.out.println(a++ + ++b);
		System.out.println(++a + b++);
		boolean c=true;  
		boolean d=false;  
		System.out.println(~a);  
		System.out.println(~b); 
		System.out.println(!c);  
		System.out.println(!d);		
	}
}
