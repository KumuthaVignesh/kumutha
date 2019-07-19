package com.Oops;

public class Electronics {
	private String name;
	private String manufacturer;
	private String os;
	// private int cost;
	private int yearofrelease;

	public void setName(String name) {
		this.name = name;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public void setYearofrelease(int yearofrelease) {
		this.yearofrelease = yearofrelease;
	}

	public String getName() {
		return name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getOs() {
		return os;
	}

	public int getYearofrelease() {
		return yearofrelease;
	}
}
