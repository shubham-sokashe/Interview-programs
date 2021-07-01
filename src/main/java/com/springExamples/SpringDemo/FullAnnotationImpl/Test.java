package com.springExamples.SpringDemo.FullAnnotationImpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Class to test the container
 * */
public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("Inside Main Method..");
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Car car1 = context.getBean("DemoCar",Car.class);
		
		System.out.println("Car1 : " + car1);
		
	}

}
