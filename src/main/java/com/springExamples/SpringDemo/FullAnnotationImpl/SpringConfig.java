package com.springExamples.SpringDemo.FullAnnotationImpl;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;

/**
 * Class to configure the container
 * */

@Configurable()
@ComponentScan(basePackages = "com.springExamples.SpringDemo.FullAnnotationImpl")
public class SpringConfig {
	
	@Bean(name="DemoCar")
	public Car getCarBean() {
		System.out.println("Car Bean is Created...");
		return new Car();
	}
	
	
	@Bean(name= "defaultSystem")
	@Primary
	public SoundSystem getSoundSystem() {
		System.out.println("Default Sound System bean created...");
		
		SoundSystem defaultsys = new SoundSystem();
		defaultsys.setBrand("Pioneer");
		defaultsys.setInterface("Digital control box");
		defaultsys.setNoOfSpeakers(4);
		return defaultsys;
	}

	@Bean(name = "PremiumSystem")
	@Lazy
	public SoundSystem getPremiumSoundSystem() {
		System.out.println("Premium Sound System bean created...");
		SoundSystem premiumsys = new SoundSystem();
		premiumsys.setBrand("Sony");
		premiumsys.setInterface("Digital Screen");
		premiumsys.setNoOfSpeakers(8);
		return premiumsys;
	}
	
}
