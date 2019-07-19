package com.corejava;

public class Constructors {
	
		int id;  
		String name; 
		public Constructors(int i,String s)
		{
			id=i;
			s=name;
			System.out.println("Constructor invoked when we create an object"+i+""+"s");
		//System.out.println(“Constructor invoked when we create an object”);
		}
		public static void main(String args[]){  
		//creating objects  
			Constructors s1=new Constructors(1,"a");  
		}  
		}  




