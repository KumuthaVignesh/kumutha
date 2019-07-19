package com.corejava;

public class MagicNumb {
	public static void main(String args[])
	{
		 int sum=0,num=199;
	        while(num>9)
	        {
	            sum=num;
	            int s=0;
	            while(sum!=0)
	            {
	                s=s+(sum%10);
	                sum=sum/10;
	            }
	            num=s;
	        }
	        if(num==1)
	        {
	            System.out.println(num+" is a Magic Number.");
	        }
	        else
	        {
	            System.out.println(num+" is not a Magic Number.");
	        }
	}

}
