package com.springExamples.SpringDemo.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Class to test Constructor based injection
 * */

public class TestInjection {
	
	public static void main(String[] args) {
		System.out.println("Inside Test Injection main method...");
		
		// creating ApplicationContext object to access beans
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springExamples/SpringDemo/constructorInjection/CIConfig.xml");

		Subject sub1 = (Subject) context.getBean("subject1");
		System.out.println("Subject 1 : " + sub1);
		
		System.out.println("----------------------------------------------");
		Course c1 = (Course)context.getBean("course1");
		System.out.println("Course 1 : " + c1);
		
	}

}
