package com.springExamples.SpringDemo.annotationsDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotations {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springExamples/SpringDemo/annotationsDemo/springAnnotationDemo.xml");
		
		VehicleBean car = context.getBean("carBean" ,VehicleBean.class);
		
		System.out.println("Car details : " + car);
		
		System.out.println("List type used : " + car.getSensors().getClass().getName());
	
	}

}
