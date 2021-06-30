package com.springExamples.SpringDemo.BeanScope;

/**
 * Example for Scope of bean
 * Scope = singleton
 * */

public class College {

	private String name;
	private String address;
	
	
	College(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	College() {
		super();
	}
	@Override
	public String toString() {
		return "College [name=" + name + ", address=" + address + "]";
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
