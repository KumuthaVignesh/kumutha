package com.corejava;

public class StaticInstance {
	
	int c=0;
	static int count=0;
	public void loc()
	{
	c++;
	count++;
	}
	public static void main(String[] args)
	{
		StaticInstance s=new StaticInstance();
		StaticInstance s1=new StaticInstance();
		StaticInstance s2=new StaticInstance();
	s.loc();
	s1.loc();
	s2.loc();
	s.loc();
	s1.loc();
	s2.loc();
	System.out.println("Instance Variable");
	System.out.println(s.c+" "+s1.c+" "+s2.c);
	System.out.println("Static variable");
	System.out.println(s.count+" "+s1.count+" "+s2.count);
	}
	}
