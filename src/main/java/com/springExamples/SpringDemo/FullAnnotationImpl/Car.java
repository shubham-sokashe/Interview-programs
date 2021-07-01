package com.springExamples.SpringDemo.FullAnnotationImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;

/**
 * Car is a Main bean 
 * and has dependency over Engine and GearBox beans
 * */

@DependsOn("Engine1")
public class Car {	
	
	@Value("Audi")
	private String brand;
	
	@Value("Q3")
	private String model;
	
	@Autowired(required = true)
	private Engine engine;
	
	@Autowired
	@Qualifier("PremiumSystem")
	private SoundSystem sounds;
	
	private GearBox gearbox;

	Car(Engine engine, GearBox gearbox) {
		super();
		this.engine = engine;
		this.gearbox = gearbox;
	}

	Car() {
		super();
		System.out.println("Car Bean No Arg COnstructor called..");
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public Engine getEngine() {
		return engine;
	}

	public GearBox getGearbox() {
		return gearbox;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Autowired
	public void setGearbox(GearBox gearbox) {
		System.out.println("Car Gear box Setter Called..");
		this.gearbox = gearbox;
	}

	public SoundSystem getSounds() {
		return sounds;
	}

	public void setSounds(SoundSystem sounds) {
		this.sounds = sounds;
	}

	@Override
	public String toString() {
		return "Car Details :brand = " + brand + ", model = " + model + ", \nengine Details = " + engine  + ","
				+ " \ngearbox Details = " + gearbox + "\nSoundSystem = " + sounds;
	}

}
