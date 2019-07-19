package com.corejava;

public class StringLiteral {

	public static void main(String[] args) {
		String s1 = new String("ONESOFT");
		String s2 = "String Methods";
		String s3 = "             String Methods";
		System.out.println(s1.charAt(2));
		System.out.println(s1.codePointAt(3));
		System.out.println(s1.compareTo(s2));
		String s4 = s1.concat(" " + s2);
		System.out.println(s1.concat(s4));
		System.out.println(s1.substring(2, 6));
		System.out.println(s1.contains(s1));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s2.indexOf("ho"));
		System.out.println(s2.indexOf('r'));
		System.out.println(s2.replace("Methods", "Class Methods"));
		System.out.println(s3.split("soft"));
		System.out.println(s3.trim());

	}

}
