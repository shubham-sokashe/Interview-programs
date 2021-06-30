package com.springExamples.SpringDemo.beanLifeCyle;

/**
 * Eample of Spring life cycle
 * for implementing the custom init() and destroy() method 
 * 
 * */
public class PensileBean {
	
	private String brand;
	
	private String type;
	
	private String color;

	
	PensileBean() {
		super();
	}

	PensileBean(String brand, String type, String color) {
		super();
		System.out.println("Setting the Properties of PensileBean");
		this.brand = brand;
		this.type = type;
		this.color = color;
	}


	@Override
	public String toString() {
		return "PensileBean [brand=" + brand + ", type=" + type + ", color=" + color + "]";
	}

	public String getBrand() {
		return brand;
	}

	public String getType() {
		return type;
	}

	public String getColor() {
		return color;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void init() {
		System.out.println("Inside init method of PensileBean..");
	}

	
	public void destory() {
		System.out.println("Inside destroy method of PensileBean...");
	}
}
