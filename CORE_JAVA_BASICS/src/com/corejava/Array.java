package com.corejava;

public class Array {
	public static void main(String[] args) {
	      int age[] = new int[5];
	     
	      age[0]=10;
	      age[1]=20;
	      age[2]=30;
	      age[3]=40;
	      age[4]=50;
	      for (int i = 0; i < 5; i++) 
	      {
	         System.out.println(age[i]);
	      }

	      
	      int a[]= {11,22,33,44,55};
	      for (int i = 0; i < 5; i++) 
	      {
	         System.out.println(a[i]);
	      }
	      
	      int b[]=new int[5];
	      b[2]=111;
	      b[4]=222;
	      for (int i = 0; i < 5; i++) 
	      {
	         System.out.println(b[i]);
	      }
}
}
