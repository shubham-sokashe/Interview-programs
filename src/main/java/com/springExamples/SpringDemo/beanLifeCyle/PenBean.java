package com.springExamples.SpringDemo.beanLifeCyle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * example of bean life cycle using the Interfaces
 * */

public class PenBean  implements InitializingBean , DisposableBean{
	
	private String brand , color , type;

	
	PenBean() {
		super();
	}

	@Override
	public String toString() {
		return "PenBean [brand=" + brand + ", color=" + color + ", type=" + type + "]";
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public String getType() {
		return type;
	}

	public void setBrand(String brand) {
		System.out.println("Calling Setter method of Pen Bean ");
		this.brand = brand;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void destroy() throws Exception {
		System.out.println("Destroying  the Pen Bean..");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing the Pen Bean..");
	}

}
