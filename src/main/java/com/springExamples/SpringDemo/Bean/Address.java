package com.springExamples.SpringDemo.Bean;

public class Address {
	
	private String country;
	
	private String city;
	
	private long pinCode;

	Address() {
		super();
	}

	public String getCountry() {
		return country;
	}

	public String getCity() {
		return city;
	}

	public long getPinCode() {
		return pinCode;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [country=" + country + ", city=" + city + ", pinCode=" + pinCode + "]";
	}
	

}
