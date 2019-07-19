package com.corejava;

public class ArmstrongNum {
	public static void main(String args[]) {
	/*int c=0,a,temp;  
    int n=153;
    temp=n; 
    for(int i=1;i<n;i++)
    {
     while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    } 
    
    if(temp==c)  
    {
    System.out.println("armstrong number");   }
    else  
    {
        System.out.println("Not armstrong number");
    }*/
    
		int num,rem,limit=1000, sum = 0;
		System.out.print("Armstrong numbers from 1 to N:");
		for (int i = 1; i <= limit; i++)
		{
			num = i;
			while (num > 0)
			{
				rem = num % 10;
				sum = sum + (rem*rem*rem);
				num = num / 10;
			}
	 
			if (sum == i)
			{
				System.out.print(i + " ");
			}
		sum = 0;
}}}
