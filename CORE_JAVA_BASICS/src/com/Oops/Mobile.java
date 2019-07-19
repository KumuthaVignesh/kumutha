package com.Oops;

public class Mobile extends Mob {
	public int cost(int mob, int lab) {
		// System.out.println("The Cost is"+mob+" "+lab);
		int total = mob + lab;
		return total;
	}

	public float cost(float mob, float lab) {
		// System.out.println("The Cost is"+mob+" "+lab);
		float total = mob + lab;
		return total;

	}

	public void Wificonnection() {
		System.out.println("Connected the network");

	}

	public void processor() {
		System.out.println("The processor are......");
	}

}
