package com.springExamples.SpringDemo.autowiringAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowireAnnotation {
	
	public static void main(String[] args) {
		System.out.println("inside main method");
		@SuppressWarnings({ "resource" })
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springExamples/SpringDemo/autowiringAnnotation/springAutowireAnoo.xml");
		Employee emp = context.getBean("emp1", Employee.class);
		
		System.out.println("employee details : " + emp);
		
		System.out.println("=================================");
		
		WorkStation wk = context.getBean("wkbean1", WorkStation.class);
		System.out.println("workstation details : " + wk);
	}

}
