package com.corejava2;

public class CollegeEncap extends Semloading{
	//public class CollegeEncap extends Semloading{
	private String name;
	private String address;
	private int total;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public void setTotal(int total)
	{
		this.total=total;
	}
	
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public int getTotal()
	{
		return total;
	}
}
