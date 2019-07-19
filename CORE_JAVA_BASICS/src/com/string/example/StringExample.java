package com.string.example;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s=new String("         Welcome");
		String s1="Welcomecome";
		
		System.out.println(s.length());
		System.out.println(s.charAt(3));
		s=s.concat("    To Java    ");
		System.out.println(s);
		System.out.println(s.trim());
		String s2=s1.substring(1,5);
		System.out.println(s2);
		System.out.println(s1.substring(2));
		System.out.println(s.contains("cm"));
		System.out.println(s1.indexOf("co"));
		System.out.println(s1.lastIndexOf("c"));
		System.out.println(s1.lastIndexOf(3,9));
		}
	}
