package com.corejava;

public class Switch {
	public static void main(String args[])
	{
	
	int a=5,b=10,c,n=1;
	
	switch(n)
	{
	case 1:
		c=a+b;
		System.out.println(c);
	
	case 2:
		c=a-b;
		System.out.println(c);
		
	case 3:
		c=a*b;
		System.out.println(c);
		
	case 4:
		c=a/b;
		System.out.println(c);
		break;
	}

}
}