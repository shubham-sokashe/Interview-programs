package com.springExamples.SpringDemo.beanLifeCyle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Example of life cycle of bean using the annotations 
 * */

public class MarkerBean {
	
	private String brand , color ;

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public void setBrand(String brand) {
		System.out.println("--setting properties of Marker Bean");
		this.brand = brand;
	}

	public void setColor(String color) {
		this.color = color;
	}

	MarkerBean() {
		super();
	}

	@Override
	public String toString() {
		return "MarkerBean [brand=" + brand + ", color=" + color + "]";
	}
	

	// init method()
	@PostConstruct
	public void start() {
		System.out.println("inside init method of marker Bean");
	}
	
	
	
	
	// destroy method
	@PreDestroy
	public void destroy() {
		System.out.println("inside destroy method of marker Bean");	
	}
	

}
