package com.springExamples.SpringDemo.FullAnnotationImpl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * This is dependency bean for Car
 * *
*/
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class GearBox {
	@Value("6")
	private int noOfGears;
	
	@Value("bavel Gears")
	private String typeofGears;
	
	@Value("Manual Shifting")
	private String typeOfShifting;

	GearBox() {
		super();
		System.out.println("GearBox Bean no arg constructor called");
	}

	GearBox(int noOfGears, String typeofGears, String typeOfShifting) {
		super();
		this.noOfGears = noOfGears;
		this.typeofGears = typeofGears;
		this.typeOfShifting = typeOfShifting;
		System.out.println("GearBox Bean no arg constructor called");
	}

	@Override
	public String toString() {
		return "GearBox [noOfGears=" + noOfGears + ", typeofGears=" + typeofGears + ", typeOfShifting=" + typeOfShifting
				+ "]";
	}

	public int getNoOfGears() {
		return noOfGears;
	}

	public String getTypeofGears() {
		return typeofGears;
	}

	public String getTypeOfShifting() {
		return typeOfShifting;
	}

	public void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
	}

	public void setTypeofGears(String typeofGears) {
		this.typeofGears = typeofGears;
	}

	public void setTypeOfShifting(String typeOfShifting) {
		this.typeOfShifting = typeOfShifting;
	}

}
