package com.corejava;

public class Absmyclass extends AbsStudent{
void dept()
{
	System.out.println("CSE");
}
void year()
{
	System.out.println("1994");
}
public static void main(String args[])
{
	Absmyclass m=new Absmyclass();
	m.details();
	m.dept();
	m.year();
}
}
