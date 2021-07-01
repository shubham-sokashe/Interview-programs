package com.springExamples.SpringDemo.FullAnnotationImpl;


/**
 * This is dependency bean for Car
 * *
*/
public class SoundSystem {
	
	private String brand;
	
	private int noOfSpeakers;
	
	private String Interface;

	SoundSystem() {
		super();
	}

	SoundSystem(String brand, int noOfSpeakers, String interface1) {
		super();
		this.brand = brand;
		this.noOfSpeakers = noOfSpeakers;
		Interface = interface1;
	}

	public String getBrand() {
		return brand;
	}

	public int getNoOfSpeakers() {
		return noOfSpeakers;
	}

	public String getInterface() {
		return Interface;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setNoOfSpeakers(int noOfSpeakers) {
		this.noOfSpeakers = noOfSpeakers;
	}

	public void setInterface(String interface1) {
		Interface = interface1;
	}

	@Override
	public String toString() {
		return "SoundSystem [brand=" + brand + ", noOfSpeakers=" + noOfSpeakers + ", Interface=" + Interface + "]";
	}

}
