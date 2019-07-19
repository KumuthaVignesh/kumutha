package com.Oops;

public class Main extends Lab {
	public void sendmessage()
	{
		System.out.println("Message not sent");
	}
	public static void main(String args[])
	{
		Electronics e=new Electronics();
		e.setManufacturer("chennai");
		e.setName("OPPO");
		e.setOs("Andriod");
		e.setYearofrelease(2011);
				
		Main m=new Main();
		m.connectBluetooth();
		m.dial();
		m.emicode();
		m.sendmessage();
		m.Wificonnection();
		m.processor();
		m.cost(10000, 15000);
		System.out.println("total");
		System.out.println(e.getManufacturer()+e.getName()+e.getOs()+e.getYearofrelease());
		
		
	}
}
