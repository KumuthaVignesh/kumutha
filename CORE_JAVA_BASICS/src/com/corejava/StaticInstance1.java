package com.corejava;

public class StaticInstance1 {

	
	int c=0;
	static int count=0;
	public void loc()
	{
	c++;
	count++;
	}
	public static void main(String[] args)
	{
		StaticInstance1 s=new StaticInstance1();
		StaticInstance1 s1=new StaticInstance1();
		StaticInstance1 s2=new StaticInstance1();
	s.loc();
	s.loc();
	s.loc();
	s.loc();
	s1.loc();
	s2.loc();
	s.loc();
	System.out.println("Instance Variable");
	System.out.println(s.c+" "+s1.c+" "+s2.c);
	System.out.println("Static variable");
	System.out.println(s.count+" "+s1.count+" "+s2.count);
	}
	}
