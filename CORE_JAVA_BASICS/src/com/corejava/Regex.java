package com.corejava;

public class Regex {
	public static void main(String args[]) {
	String s="kumu87thas1398gmail.com";
	
	System.out.println(s);
	
	String s2[]=s.split("[.]");
	String s1[]=s.split("[0-9]");
	String s11[]=s.split("[a-z,A-Z]");
	//String s1[0]=kumuthas;
	for(int i=0;i<s2.length;i++)

	{
		System.out.println(i+" index "+s2[i]);//");
	}
	//System.out.println("first"+s1[0].substring(0, 7));
	//[0]="kumuthas";
	//s1[1]="@gmail.com";
	//s2[8]=1394;
	/*String a=s1[0];
	String b=s1[4];
	String c=s1[1];
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println("first"+s1[0].substring(0, 3));*/
	//System.out.println("dob"+s[].);
	
	}
}
