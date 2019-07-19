package com.corejava;

public class SumofGivenNum {
	public static void main(String args[]) {
		int n=125,i,sum=0;
		while(n>0)
	{
		 i = n % 10;
         sum = sum + i;
         n = n / 10;
	}
	System.out.println(sum);
	}
}