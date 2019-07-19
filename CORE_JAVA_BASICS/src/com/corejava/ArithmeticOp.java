package com.corejava;

public class ArithmeticOp {
	public static void main(String args[])
	{
		//Unary Operator
		
		int x=10;  
		System.out.println(x++); //10 (11)  
		System.out.println(++x); //12  
		System.out.println(x--); //12 (11)  
		System.out.println(--x);
		
		//Arithmetic Operator
		
		int a=5,b=6,c=20,d=16,e=5,j;
		System.out.println(a+b);
		System.out.println(c-d);
		System.out.println(a*b);
		System.out.println(c/a);
		System.out.println(a%b);
		System.out.println(15*3+((12/4)+(20/5)-6));
		
		//Shift operator
		
		System.out.println(10<<2);
		System.out.println(10>>2);
		System.out.println(-10>>2);
		System.out.println(-10<<2);
		//System.out.println(10<<<2);
		System.out.println(10>>>2);
		
		//Relational Operator
		
		System.out.println("a==b"+" "+ (a==b));
		System.out.println("a!=b"+" "+ (a!=b));
		System.out.println("a<b"+" "+ (a<b));
		System.out.println("a>b"+" "+ (a>b));
		System.out.println("a<=e"+" "+ (a<=e));
		System.out.println("a>=b"+" "+ (a>=b));
		
		//Bitwise Operator
		
		
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(~a);
		
		
		//Logical Operator
		
		System.out.println(a>b|a<c);
		System.out.println(a>b|| a++<b);
		System.out.println(a>b|| a<b);
		
		//Ternary Operator
		
		j=(a>b)?a:b;
		int k=(a>c)?a:c;
		System.out.println(j);
		System.out.println(k);
		}
	}
