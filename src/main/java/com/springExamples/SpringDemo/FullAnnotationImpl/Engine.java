package com.springExamples.SpringDemo.FullAnnotationImpl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * This is dependency bean for Car
 * */

@Component("Engine1")
@Scope("singleton")
public class Engine {
	
	@Value("Twin Cylinder V-type")
	private String engineType;
	
	@Value("Petrol")
	private String FuelType;
	
	@Value("8")
	private int noOfCylinders;

	Engine() {
		super();
		System.out.println("Engine Bean no arg constructor called");
	}

	Engine(String engineType, String fuelType, int noOfCylinders) {
		super();
		this.engineType = engineType;
		FuelType = fuelType;
		this.noOfCylinders = noOfCylinders;
		System.out.println("Engine Bean no parimetrized constructor called");
	}

	@Override
	public String toString() {
		return "Engine [engineType=" + engineType + ", FuelType=" + FuelType + ", noOfCylinders=" + noOfCylinders + "]";
	}

	public String getEngineType() {
		return engineType;
	}

	public String getFuelType() {
		return FuelType;
	}

	public int getNoOfCylinders() {
		return noOfCylinders;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public void setFuelType(String fuelType) {
		FuelType = fuelType;
	}

	public void setNoOfCylinders(int noOfCylinders) {
		this.noOfCylinders = noOfCylinders;
	}

}
